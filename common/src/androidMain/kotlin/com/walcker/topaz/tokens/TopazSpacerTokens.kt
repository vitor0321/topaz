package com.walcker.topaz.tokens

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public enum class TopazSpacerOrientation {
    Horizontal,
    Vertical,
    All,
}

public enum class TopazSpacerSizeToken(
    public val horizontalHeight: Dp,
    public val verticalWidth: Dp,
    public val all: Dp,
) {
    None(
        horizontalHeight = 0.dp,
        verticalWidth = 0.dp,
        all = 0.dp,
    ),
    Small(
        horizontalHeight = 2.dp,
        verticalWidth = 2.dp,
        all = 2.dp,
    ),
    MSmall(
        horizontalHeight = 4.dp,
        verticalWidth = 4.dp,
        all = 4.dp,
    ),
    XSmall(
        horizontalHeight = 8.dp,
        verticalWidth = 8.dp,
        all = 8.dp,
    ),
    Medium(
        horizontalHeight = 14.dp,
        verticalWidth = 14.dp,
        all = 14.dp,
    ),
    MMedium(
        horizontalHeight = 16.dp,
        verticalWidth = 16.dp,
        all = 16.dp,
    ),
    XMedium(
        horizontalHeight = 20.dp,
        verticalWidth = 20.dp,
        all = 20.dp,
    ),
    Large(
        horizontalHeight = 24.dp,
        verticalWidth = 24.dp,
        all = 24.dp,
    ),
    MLarge(
        horizontalHeight = 32.dp,
        verticalWidth = 32.dp,
        all = 32.dp,
    ),
    XSLarge(
        horizontalHeight = 42.dp,
        verticalWidth = 42.dp,
        all = 42.dp,
    ),
    XLarge(
        horizontalHeight = 56.dp,
        verticalWidth = 56.dp,
        all = 56.dp,
    ),
    ExtraLarge(
        horizontalHeight = 62.dp,
        verticalWidth = 62.dp,
        all = 62.dp,
    ),
    XExtraLarge(
        horizontalHeight = 78.dp,
        verticalWidth = 78.dp,
        all = 78.dp,
    ),
    XLExtraLarge(
        horizontalHeight = 100.dp,
        verticalWidth = 100.dp,
        all = 100.dp,
    ),
    XLSExtraLarge(
        horizontalHeight = 120.dp,
        verticalWidth = 120.dp,
        all = 120.dp,
    ),
    XXExtraLarge(
        horizontalHeight = 200.dp,
        verticalWidth = 200.dp,
        all = 200.dp,
    ),
}