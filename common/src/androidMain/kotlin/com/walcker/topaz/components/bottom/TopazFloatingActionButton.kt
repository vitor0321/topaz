package com.walcker.topaz.components.bottom

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.theme.TopazTheme

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazFloatingActionButton(
    onClick: () -> Unit,
) {
    FloatingActionButton(
        modifier = Modifier.padding(top = 6.dp),
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        shape = CircleShape,
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            hoveredElevation = 0.dp,
            focusedElevation = 0.dp,
        ),
        onClick = onClick,
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null,
        )
    }
}

@OptIn(ExperimentalTopazComposeLibraryApi::class)
@Preview(showBackground = true)
@Composable
private fun TopazFloatingActionButtonPreview() {
    TopazTheme {
        TopazFloatingActionButton(
            onClick = {}
        )
    }
}