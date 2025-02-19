package com.walcker.topaz.tokens

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

public enum class TopazCircularStrokeToken(
    public val width: Dp,
    public val height: Dp,
) {
    None(
        width = 0.dp,
        height = 0.dp,
    ),
    Small(
        width = 2.dp,
        height = 2.dp,
    ),
    MSmall(
        width = 4.dp,
        height = 4.dp,
    ),
    XSmall(
        width = 8.dp,
        height = 8.dp,
    ),
    Medium(
        width = 14.dp,
        height = 14.dp,
    ),
    MMedium(
        width = 16.dp,
        height = 16.dp,
    ),
    XMedium(
        width = 20.dp,
        height = 20.dp,
    ),
    Large(
        width = 24.dp,
        height = 24.dp,
    ),
    MLarge(
        width = 32.dp,
        height = 32.dp,
    ),
    XSLarge(
        width = 42.dp,
        height = 42.dp,
    ),
    XLarge(
        width = 56.dp,
        height = 56.dp,
    ),
    ExtraLarge(
        width = 62.dp,
        height = 62.dp,
    ),
    XExtraLarge(
        width = 78.dp,
        height = 78.dp,
    ),
    XXExtraLarge(
        width = 200.dp,
        height = 200.dp,
    ),
}