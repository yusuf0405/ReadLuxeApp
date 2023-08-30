package com.joseph.readluxe.onboarding.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.joseph.readluxe.core.ui.theme.ReadLuxeAppTheme

@Composable
fun OnboardingScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Onboarding Screen",
            style = ReadLuxeAppTheme.typography.titleExtraLarge.bold,
            color = ReadLuxeAppTheme.colors.textPrimary
        )
    }
}