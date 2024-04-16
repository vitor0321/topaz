package com.walcker.topaz.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi

@ExperimentalTopazComposeLibraryApi
@OptIn(ExperimentalMaterial3Api::class)
@Composable
public fun TopazTopAppBar(
    modifier: Modifier = Modifier,
    title: String,
    actions: @Composable () -> Unit = {},
    navigationIcon: @Composable () -> Unit = {}
) {
    TopAppBar(
        modifier = modifier,
        title = {
            Text(text = title)
        },
        actions = { actions() },
        navigationIcon = { navigationIcon() }
    )
}