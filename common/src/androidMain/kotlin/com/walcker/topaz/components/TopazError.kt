package com.walcker.topaz.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.components.loading.TopazCircularProgress
import com.walcker.topaz.theme.TopazTheme

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazError(
    modifier: Modifier = Modifier,
    title: String? = null,
    message: String,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        title?.let {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 28.sp,
                    textAlign = TextAlign.Center
                )
            )
        }
        TopazVerticalSpacer()
        Text(
            text = message,
            style = TextStyle(
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )
        )
    }
}

@OptIn(ExperimentalTopazComposeLibraryApi::class)
@Preview(showBackground = true)
@Composable
private fun TopazErrorPreview() {
    TopazTheme {
        TopazError(
            title = "Ops!",
            message = "Algo deu errado",
        )
    }
}