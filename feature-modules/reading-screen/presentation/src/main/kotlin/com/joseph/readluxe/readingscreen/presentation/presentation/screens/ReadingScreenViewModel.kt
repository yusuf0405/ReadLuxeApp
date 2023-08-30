package com.joseph.readluxe.readingscreen.presentation.presentation.screens

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.joseph.readluxe.core.common.volume.FetchVolumeButtonClickActions
import com.joseph.readluxe.readingscreen.presentation.presentation.models.BookFont
import com.joseph.readluxe.readingscreen.presentation.presentation.models.BookFontsStyle
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ReadingScreenViewModel @Inject constructor(
    private val fetchVolumeButtonClickActions: FetchVolumeButtonClickActions,
) : ViewModel() {

    var uiState by mutableStateOf(ReadingScreenUiState())
        private set

    private val selectedFont = BookFont.allFonts().first()
    private val selectedFontsStyle = selectedFont.fontSubTypes.first()
    private val selectedFontSize = 24f
    private val selectedLineHeight = 24f

    init {
        uiState = uiState.copy(
            fonts = BookFont.allFonts(),
            selectedFont = selectedFont,
            selectedFontSize = selectedFontSize,
            selectedFontsStyle = selectedFontsStyle,
            selectedLineHeight = selectedLineHeight
        )
    }

    fun volumeButtonsFlow() = fetchVolumeButtonClickActions.fetchVolumeButtonClickActions().onEach {
        Log.i("Joseph", "onEach")
    }

    fun onSelectedFont(font: BookFont) {
        if (font == uiState.selectedFont) return
        uiState = uiState.copy(
            selectedFont = font,
            selectedFontsStyle = font.fontSubTypes.first()
        )
    }

    fun onSelectedFontStyle(style: BookFontsStyle) {
        if (style == uiState.selectedFontsStyle) return
        uiState = uiState.copy(
            selectedFontsStyle = style
        )
    }

    fun onSelectedFontSize(fontSize: Float) {
        uiState = uiState.copy(
            selectedFontSize = fontSize
        )
    }

    fun onLineHeightChange(lineHeight: Float) {
        uiState = uiState.copy(
            selectedLineHeight = lineHeight
        )
    }
}