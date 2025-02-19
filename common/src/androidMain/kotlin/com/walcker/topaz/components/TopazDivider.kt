package com.walcker.topaz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.components.topAppBar.TopazTopAppBar
import com.walcker.topaz.theme.TopazTheme
import com.walcker.topaz.tokens.TopazDividerSizeToken
import com.walcker.topaz.tokens.TopazDividerTokens

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazDividerHorizontal(
    modifier: Modifier = Modifier,
    size: TopazDividerSizeToken = TopazDividerSizeToken.Small,
) {
    HorizontalDivider(
        modifier = modifier
            .fillMaxWidth()
            .height(size.horizontalWidth)
            .background(TopazDividerTokens.background)
    )
}

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazDividerVertical(
    modifier: Modifier = Modifier,
    size: TopazDividerSizeToken = TopazDividerSizeToken.Small,
) {
    VerticalDivider(
        modifier = modifier
            .fillMaxWidth()
            .height(size.horizontalWidth)
            .background(TopazDividerTokens.background)
    )
}

@ExperimentalTopazComposeLibraryApi
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
private fun TopazDividerHorizontalPreview() {
    TopazTheme {
        TopazDividerHorizontal()
    }
}

@ExperimentalTopazComposeLibraryApi
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
private fun TopazDividerVerticalPreview() {
    TopazTheme {
        TopazDividerVertical()
    }
}