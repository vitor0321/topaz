package com.walcker.topaz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.tokens.TopazDividerOrientation
import com.walcker.topaz.tokens.TopazDividerSize
import com.walcker.topaz.tokens.TopazDividerTokens

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazDividerHorizontal(
    modifier: Modifier = Modifier,
    size: TopazDividerSize = TopazDividerSize.Small,
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
    size: TopazDividerSize = TopazDividerSize.Small,
) {
    VerticalDivider(
        modifier = modifier
            .fillMaxWidth()
            .height(size.horizontalWidth)
            .background(TopazDividerTokens.background)
    )
}