package com.joseph.readluxe.core.ui.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

val LocalReadLuxeTypography = staticCompositionLocalOf<ReadLuxeTypography> {
    error("No typography provided")
}

@Composable
fun ProvideReadLuxeTypography(
    readLuxeTypography: ReadLuxeTypography,
    content: @Composable () -> Unit,
) {
    val styles = remember { readLuxeTypography }
    CompositionLocalProvider(
        values = arrayOf(LocalReadLuxeTypography provides styles),
        content = content
    )
}