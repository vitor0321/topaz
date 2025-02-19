package com.walcker.topaz.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ErrorOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.components.loading.TopazCircularProgress
import com.walcker.topaz.theme.TopazTheme

@ExperimentalTopazComposeLibraryApi
@Composable
private fun TopazIcon(
    icon: ImageVector,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.secondary,
    contentDescription: String = remember(icon) {
        icon.name.replace('_', ' ')
    },
) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = modifier.fillMaxSize(),
            imageVector = icon,
            contentDescription = contentDescription,
            tint = color
        )
    }
}

@OptIn(ExperimentalTopazComposeLibraryApi::class)
@Preview(showBackground = true)
@Composable
private fun TopazIconPreview() {
    TopazTheme {
        TopazIcon(
            icon = Icons.Rounded.ErrorOutline
        )
    }
}