package com.walcker.topaz.components.dialog

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.theme.TopazTheme

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazDialog(
    title: String? = null,
    message: String,
    confirmButtonText: String,
    onEventDismiss: () -> Unit,
    onEventConfirm: () -> Unit,
) {
    AlertDialog(
        onDismissRequest = onEventDismiss,
        title = {
            if (title != null)
                Text(
                    text = title,
                    color = MaterialTheme.colorScheme.error,
                    style = MaterialTheme.typography.titleMedium
                )
        },
        text = {
            Text(
                text = message,
                color = MaterialTheme.colorScheme.onError,
                style = MaterialTheme.typography.bodyMedium
            )
        },
        confirmButton = {
            TextButton(
                onClick = onEventConfirm,
                content = { Text(text = confirmButtonText) }
            )
        },
        containerColor = MaterialTheme.colorScheme.outlineVariant,
        titleContentColor = MaterialTheme.colorScheme.onSecondary,
        textContentColor = MaterialTheme.colorScheme.onSecondary
    )
}

@ExperimentalTopazComposeLibraryApi
@Preview(showBackground = true)
@Composable
private fun TopazDialogPreview() {
    TopazTheme {
        TopazDialog(
            title = "Erro de validação de formulário",
            message = "Erro de validação de formulário, confira os dados e tente novamente",
            confirmButtonText = "Ok",
            onEventDismiss = { },
            onEventConfirm = { },
        )
    }
}