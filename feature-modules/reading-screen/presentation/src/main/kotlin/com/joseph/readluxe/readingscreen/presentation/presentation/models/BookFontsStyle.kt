package com.joseph.readluxe.readingscreen.presentation.presentation.models

import androidx.annotation.FontRes
import androidx.annotation.StringRes
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

data class BookFontsStyle(
    @StringRes val titleId: Int,
    @FontRes val fontId: Int,
) {

    fun fontFamily() = FontFamily(
        listOf(
            Font(
                fontId,
                FontWeight.Normal
            )
        )
    )
}