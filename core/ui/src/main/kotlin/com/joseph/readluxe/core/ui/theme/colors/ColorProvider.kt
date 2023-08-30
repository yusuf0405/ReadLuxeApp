package com.joseph.readluxe.core.ui.theme.colors

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

val LocalReadLuxeColors = staticCompositionLocalOf<ReadLuxeColors> {
    error("No palette provided")
}

@Composable
fun ProvideReadLuxeColors(
    colors: ReadLuxeColors,
    content: @Composable () -> Unit,
) {
    val palette = remember { colors }
    palette.update(colors)
    CompositionLocalProvider(
        values = arrayOf(LocalReadLuxeColors provides palette),
        content = content
    )
}