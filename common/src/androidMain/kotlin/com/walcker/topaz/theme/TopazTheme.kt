package com.walcker.topaz.theme

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.Window
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.walcker.topaz.tokens.TopazTypographyToken

@Composable
public fun TopazTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    useDynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        useDynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> TopazDarkColorScheme
        else -> TopazLightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            applyWindowInsets(window, view, colorScheme, darkTheme)
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = MaterialTheme.typography.copy(
            displayLarge = TopazTypographyToken.heading1,
            displayMedium = TopazTypographyToken.heading2,
            displaySmall = TopazTypographyToken.heading3,
            bodyLarge = TopazTypographyToken.body1,
            bodyMedium = TopazTypographyToken.body2,
            labelSmall = TopazTypographyToken.caption
        ),
        content = content
    )
}

private fun applyWindowInsets(window: Window, view: View, colorScheme: ColorScheme, darkTheme: Boolean) {
    window.statusBarColor = colorScheme.primary.toArgb()
    WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
}
