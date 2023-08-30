package com.joseph.readluxe.readingscreen.presentation.presentation.components

import com.joseph.readluxe.readingscreen.presentation.presentation.BookPage
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joseph.readluxe.core.ui.extensions.fadingEdge
import com.joseph.readluxe.core.ui.extensions.noRippleClickable
import com.joseph.readluxe.core.ui.theme.LargeSpacing
import com.joseph.readluxe.core.ui.theme.MediumSpacing
import com.joseph.readluxe.core.ui.theme.ReadLuxeAppTheme
import com.joseph.readluxe.readingscreen.presentation.presentation.models.BookFont
import com.joseph.readluxe.readingscreen.presentation.presentation.models.BookFontsStyle

@Preview
@Composable
fun PageItemPreview() {
    ReadLuxeAppTheme {
        PageItem(
            page = BookPage.previews.first(),
            onClick = {},
            openNextPage = {},
            openPreviousPage = {},
            selectedFontStyle = BookFont.allFonts().first().fontSubTypes.first(),
            selectedLineHeight = 14,
            selectedFontSize = 14
        )
    }
}

@Composable
fun PageItem(
    modifier: Modifier = Modifier,
    page: BookPage,
    background: Color = MaterialTheme.colors.background,
    textStyle: TextStyle = MaterialTheme.typography.h1,
    onClick: () -> Unit,
    openNextPage: () -> Unit,
    openPreviousPage: () -> Unit,
    selectedFontStyle: BookFontsStyle,
    selectedFontSize: Int,
    selectedLineHeight: Int,
) {
    val scrollState = rememberScrollState()
    val bottomFadeValue = if (scrollState.value >= scrollState.maxValue) 1f else 0.8f

    val topAndBottomFade = Brush.verticalGradient(
        bottomFadeValue to Color.Red,
        1f to Color.Transparent,
    )

    Box {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(background)
                .padding(LargeSpacing)
                .noRippleClickable { onClick() }
        ) {
            Spacer(modifier = modifier.height(LargeSpacing + MediumSpacing))
            SelectionContainer(
                modifier = modifier
                    .weight(1f)
                    .fadingEdge(topAndBottomFade)
                    .verticalScroll(scrollState),
            ) {
                Text(
                    text = page.content,
                    style = textStyle.copy(
                        lineHeight = selectedLineHeight.sp,
                        fontFamily = selectedFontStyle.fontFamily(),
                        fontSize = selectedFontSize.sp,
                    )
                )
            }
            Box(
                modifier = modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = page.page.toString(),
                    color = MaterialTheme.colors.onBackground
                )
            }
        }
        Spacer(
            modifier = modifier
                .width(80.dp)
                .fillMaxHeight()
                .align(Alignment.CenterStart)
                .noRippleClickable { openPreviousPage() }
        )
        Spacer(
            modifier = modifier
                .width(80.dp)
                .fillMaxHeight()
                .align(Alignment.CenterEnd)
                .noRippleClickable { openNextPage() }
        )
    }
}