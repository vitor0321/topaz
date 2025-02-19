package com.walcker.topaz.tokens

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public object TopazDividerTokens {
    val background: Color = Color.Gray
}

public enum class TopazDividerOrientation {
    Horizontal,
    Vertical,
}

public enum class TopazDividerSizeToken(
    public val horizontalWidth: Dp,
    public val verticalHeight: Dp,
) {
    None(
        horizontalWidth = 0.dp,
        verticalHeight = 0.dp,
    ),
    Small(
        horizontalWidth = 2.dp,
        verticalHeight = 2.dp,
    ),
    MSmall(
        horizontalWidth = 4.dp,
        verticalHeight = 4.dp,
    ),
    XSmall(
        horizontalWidth = 8.dp,
        verticalHeight = 8.dp,
    ),
    Medium(
        horizontalWidth = 14.dp,
        verticalHeight = 14.dp,
    ),
    MMedium(
        horizontalWidth = 16.dp,
        verticalHeight = 16.dp,
    ),
    XMedium(
        horizontalWidth = 20.dp,
        verticalHeight = 20.dp,
    ),
    Large(
        horizontalWidth = 24.dp,
        verticalHeight = 24.dp,
    ),
    MLarge(
        horizontalWidth = 32.dp,
        verticalHeight = 32.dp,
    ),
    XSLarge(
        horizontalWidth = 42.dp,
        verticalHeight = 42.dp,
    ),
    XLarge(
        horizontalWidth = 56.dp,
        verticalHeight = 56.dp,
    ),
    ExtraLarge(
        horizontalWidth = 62.dp,
        verticalHeight = 62.dp,
    ),
    XExtraLarge(
        horizontalWidth = 78.dp,
        verticalHeight = 78.dp,
    ),
    XXExtraLarge(
        horizontalWidth = 200.dp,
        verticalHeight = 200.dp,
    ),
}