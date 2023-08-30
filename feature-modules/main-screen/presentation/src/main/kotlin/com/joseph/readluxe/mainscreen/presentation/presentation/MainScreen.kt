package com.joseph.readluxe.mainscreen.presentation.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MainScreen(
    navigateToReadingScreen: () -> Unit,
    modifier: Modifier = Modifier,
) {

    val viewModel: MainViewModel = hiltViewModel()

    Box(modifier = modifier
        .fillMaxSize()
        .clickable { navigateToReadingScreen() }) {
        Text(
            "Main Screen",
            style = MaterialTheme.typography.h1
        )
    }
}