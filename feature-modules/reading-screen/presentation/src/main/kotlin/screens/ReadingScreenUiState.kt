package screens

import models.BookFont
import models.BookFontsStyle

data class ReadingScreenUiState(
    val fonts: List<BookFont> = emptyList(),
    val selectedFont: BookFont = BookFont.allFonts().first(),
    val selectedFontsStyle: BookFontsStyle = BookFont.allFonts().first().fontSubTypes.first(),
    val selectedFontSize: Float = 14f,
    val selectedLineHeight: Float = 18f,
)