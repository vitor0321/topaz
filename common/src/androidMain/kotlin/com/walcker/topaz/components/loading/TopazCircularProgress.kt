package com.walcker.topaz.components.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.theme.TopazTheme
import com.walcker.topaz.tokens.TopazCircularStrokeToken

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazCircularProgress(
    modifier: Modifier = Modifier,
    stroke: TopazCircularStrokeToken = TopazCircularStrokeToken.Medium,
) {
    CircularProgress(
        modifier = modifier,
        stroke = stroke,
    )
}

@Composable
private fun CircularProgress(
    modifier: Modifier = Modifier,
    stroke: TopazCircularStrokeToken
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            modifier = modifier.width(45.dp),
            color = MaterialTheme.colorScheme.surfaceVariant,
            strokeWidth = stroke.width,
            trackColor = MaterialTheme.colorScheme.secondary
        )
    }
}

@OptIn(ExperimentalTopazComposeLibraryApi::class)
@Preview(showBackground = true)
@Composable
private fun TopazCircularProgressPreview() {
    TopazTheme {
        TopazCircularProgress()
    }
}