package com.walcker.topaz.tokens

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public enum class TopazSpacerOrientation {
    Horizontal,
    Vertical,
}

public enum class TopazSpacerSizeToken(
    public val horizontalHeight: Dp,
    public val verticalWidth: Dp,
) {
    None(
        horizontalHeight = 0.dp,
        verticalWidth = 0.dp,
    ),
    Small(
        horizontalHeight = 2.dp,
        verticalWidth = 2.dp,
    ),
    MSmall(
        horizontalHeight = 4.dp,
        verticalWidth = 4.dp,
    ),
    XSmall(
        horizontalHeight = 8.dp,
        verticalWidth = 8.dp,
    ),
    Medium(
        horizontalHeight = 14.dp,
        verticalWidth = 14.dp,
    ),
    MMedium(
        horizontalHeight = 16.dp,
        verticalWidth = 16.dp,
    ),
    XMedium(
        horizontalHeight = 20.dp,
        verticalWidth = 20.dp,
    ),
    Large(
        horizontalHeight = 24.dp,
        verticalWidth = 24.dp,
    ),
    MLarge(
        horizontalHeight = 32.dp,
        verticalWidth = 32.dp,
    ),
    XSLarge(
        horizontalHeight = 42.dp,
        verticalWidth = 42.dp,
    ),
    XLarge(
        horizontalHeight = 56.dp,
        verticalWidth = 56.dp,
    ),
    ExtraLarge(
        horizontalHeight = 62.dp,
        verticalWidth = 62.dp,
    ),
    XExtraLarge(
        horizontalHeight = 100.dp,
        verticalWidth = 100.dp,
    ),
    XXExtraLarge(
        horizontalHeight = 200.dp,
        verticalWidth = 200.dp,
    ),
}