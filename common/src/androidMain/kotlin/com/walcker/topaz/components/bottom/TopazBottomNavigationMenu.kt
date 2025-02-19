package com.walcker.topaz.components.bottom

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.theme.TopazTheme
import com.walcker.topaz.tokens.Grey1

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazBottomNavigationMenu(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column {
        HorizontalDivider(color = Grey1)

        NavigationBar(
            modifier = modifier,
            containerColor = MaterialTheme.colorScheme.surface,
            tonalElevation = 0.dp,
        ) {
            content()
        }
    }
}

@OptIn(ExperimentalTopazComposeLibraryApi::class)
@Preview(showBackground = true)
@Composable
private fun TopazBottomNavigationMenuPreview() {
    TopazTheme {
        TopazBottomNavigationMenu(
            content = {}
        )
    }
}