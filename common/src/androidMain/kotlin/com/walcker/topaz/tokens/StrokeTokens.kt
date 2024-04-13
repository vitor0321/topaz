package com.walcker.topaz.tokens

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class CircularStroke(
    public val width: Dp,
) {
    Small(
        width = 4.dp,
    ),
    Medium(
        width = 8.dp,
    ),
    Large(
        width = 12.dp,
    ),
}