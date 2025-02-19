package com.walcker.topaz.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import com.walcker.topaz.tokens.ColorError
import com.walcker.topaz.tokens.Green20
import com.walcker.topaz.tokens.Green40
import com.walcker.topaz.tokens.Green80
import com.walcker.topaz.tokens.Neutral10
import com.walcker.topaz.tokens.Neutral60
import com.walcker.topaz.tokens.Neutral90
import com.walcker.topaz.tokens.Surface
import com.walcker.topaz.tokens.Turqouise10
import com.walcker.topaz.tokens.Turqouise90
import com.walcker.topaz.tokens.Turquoise30
import com.walcker.topaz.tokens.Turquoise80
import com.walcker.topaz.tokens.Wildfire20
import com.walcker.topaz.tokens.Wildfire80
import com.walcker.topaz.tokens.Wildfire90

public val TopazDarkColorScheme = darkColorScheme(
    primary = Turquoise80,
    onPrimary = Color.White,
    primaryContainer = Turquoise30,
    onPrimaryContainer = Turqouise90,
    secondary = Green80,
    onSecondary = Green20,
    tertiary = Wildfire80,
    onTertiary = Wildfire20,
    surface = Neutral10,
    onSurface = Neutral90,
    onSurfaceVariant = Neutral60,
    inverseSurface = Color.White,
    inverseOnSurface = Color.Black,
    error = ColorError,
)

public val TopazLightColorScheme = lightColorScheme(
    primary = Turquoise80,
    onPrimary = Color.White,
    primaryContainer = Turqouise90,
    onPrimaryContainer = Turqouise10,
    secondary = Green40,
    onSecondary = Color.Black,
    tertiary = Wildfire90,
    onTertiary = Color.Black,
    surface = Surface,
    onSurface = Neutral10,
    onSurfaceVariant = Neutral60,
    inverseSurface = Color.Black,
    inverseOnSurface = Color.White,
    error = ColorError,
)