package com.walcker.topaz.components.image

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.walcker.compose.ui.topaz.R
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.theme.TopazTheme
import com.walcker.topaz.tokens.TopazSpacerSizeToken

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazRoundedAvatar(
    modifier: Modifier = Modifier,
    imageUri: Any?,
    contentDescription: String?,
    size: TopazSpacerSizeToken = TopazSpacerSizeToken.ExtraLarge,
    @DrawableRes defaultImage: Int = R.drawable.no_profile_image,
) {

    TopazAsyncImage(
        image = imageUri,
        modifier = modifier
            .clip(CircleShape)
            .size(size.horizontalHeight),
        contentDescription=contentDescription,
        defaultImage = defaultImage,
    )
}

@ExperimentalTopazComposeLibraryApi
@Preview(showBackground = true)
@Composable
private fun TopazRoundedAvatarPreview() {
    TopazTheme {
        TopazRoundedAvatar(
            imageUri = null,
            contentDescription = "Avatar",
        )
    }
}