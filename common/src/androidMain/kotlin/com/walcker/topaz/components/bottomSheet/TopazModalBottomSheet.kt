package com.walcker.topaz.components.bottomSheet

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.SheetValue
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.theme.TopazTheme
import com.walcker.topaz.tokens.TopazSpacerSizeToken

@ExperimentalTopazComposeLibraryApi
@OptIn(ExperimentalMaterial3Api::class)
@Composable
public fun TopazModalBottomSheet(
    modifier: Modifier = Modifier,
    sheetState: SheetState = rememberModalBottomSheetState(),
    onDismissRequest: () -> Unit,
    content: @Composable () -> Unit,
) {

    ModalBottomSheet(
        onDismissRequest = onDismissRequest,
        modifier = modifier.padding(TopazSpacerSizeToken.MSmall.horizontalHeight),
        sheetState = sheetState,
        containerColor = MaterialTheme.colorScheme.outlineVariant,
        contentColor = MaterialTheme.colorScheme.onSurface,
    ) {
        content()
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalTopazComposeLibraryApi::class)
@Preview
@Composable
private fun TopazModalBottomSheetPreview() {
    val sheetState = SheetState(
        skipPartiallyExpanded = false,
        density = Density(LocalContext.current),
        initialValue = SheetValue.Expanded,
    )
    TopazTheme {
        TopazModalBottomSheet(
            onDismissRequest = {},
            sheetState = sheetState,
            content = {}
        )
    }
}