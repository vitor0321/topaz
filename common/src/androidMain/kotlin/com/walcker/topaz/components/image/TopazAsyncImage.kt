package com.walcker.topaz.components.image

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.walcker.compose.ui.topaz.R
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.components.loading.TopazLinearProgress
import com.walcker.topaz.theme.TopazTheme
import com.walcker.topaz.tokens.TopazSpacerSizeToken

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazAsyncImage(
    modifier: Modifier = Modifier,
    image: Any?,
    contentDescription: String?,
    size: TopazSpacerSizeToken = TopazSpacerSizeToken.XXExtraLarge,
    @DrawableRes defaultImage: Int = R.drawable.no_profile_image,
) {
    var loadingImage by rememberSaveable { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .sizeIn(minHeight = size.horizontalHeight),
        contentAlignment = Alignment.Center
    ) {

        if (loadingImage)
            TopazLinearProgress()

        AsyncImage(
            modifier = Modifier.fillMaxSize(),
            model = image?.let {
                ImageRequest.Builder(LocalContext.current)
                    .data(image)
                    .build()
            },
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop,
            contentDescription = contentDescription,
            placeholder = painterResource(defaultImage),
            error = painterResource(defaultImage),
            fallback = painterResource(defaultImage),
            onLoading = { loadingImage = true },
            onSuccess = { loadingImage = false },
            onError = { loadingImage = false }
        )
    }
}

@OptIn(ExperimentalTopazComposeLibraryApi::class)
@Preview(showBackground = true)
@Composable
private fun ImageUriPreview() {
    TopazTheme {
        TopazAsyncImage(
            image = null,
            contentDescription = "Avatar",
        )
    }
}