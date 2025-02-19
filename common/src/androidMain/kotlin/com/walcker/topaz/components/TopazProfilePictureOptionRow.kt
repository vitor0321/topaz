package com.walcker.topaz.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.walcker.compose.ui.topaz.R
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.theme.TopazTheme
import com.walcker.topaz.tokens.TopazSpacerSizeToken

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazProfilePictureOptionRow(
    topazProfilePictureOptionRow: TopazProfilePictureOptionRow,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = TopazSpacerSizeToken.XLarge.horizontalHeight)
            .clickable { topazProfilePictureOptionRow.onClick() }
            .padding(horizontal = TopazSpacerSizeToken.MMedium.horizontalHeight),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        topazProfilePictureOptionRow.iconResId?.let { iconResId ->
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurface,
            )
        }

        Spacer(modifier = Modifier.width(width = TopazSpacerSizeToken.XSmall.verticalWidth))

        topazProfilePictureOptionRow.text?.let { text ->
            Text(
                text = text,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyLarge,
            )
        }
    }
}

public data class TopazProfilePictureOptionRow(
    @DrawableRes
    val iconResId: Int?,
    val text: String?,
    val onClick: () -> Unit,
)

@OptIn(ExperimentalMaterial3Api::class, ExperimentalTopazComposeLibraryApi::class)
@Preview
@Composable
private fun TopazProfilePictureOptionRowPreview() {
    TopazTheme {
        TopazProfilePictureOptionRow(
            topazProfilePictureOptionRow = TopazProfilePictureOptionRow(
                iconResId = R.drawable.ic_photo_library,
                text = "Take a photo",
                onClick = { }
            )
        )
    }
}