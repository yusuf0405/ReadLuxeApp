package com.joseph.readluxe.readingscreen.presentation.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joseph.readluxe.core.ui.R
import com.joseph.readluxe.core.ui.extensions.SpacerHeight
import com.joseph.readluxe.core.ui.extensions.SpacerWidth
import com.joseph.readluxe.core.ui.extensions.clickableNoRipple
import com.joseph.readluxe.core.ui.theme.LargeSpacing
import com.joseph.readluxe.core.ui.theme.MediumSpacing
import com.joseph.readluxe.core.ui.theme.ReadLuxeAppTheme
import com.joseph.readluxe.core.ui.theme.SmallSpacing
import com.joseph.readluxe.readingscreen.presentation.presentation.models.BookFont
import com.joseph.readluxe.readingscreen.presentation.presentation.models.BookFontsStyle

@Preview
@Composable
fun PageFontSettingPreview() {
    ReadLuxeAppTheme {
        BookFontSetting(
            fonts = BookFont.allFonts(),
            selectedFont = BookFont.allFonts().first(),
            selectedFontStyle = BookFont.allFonts().first().fontSubTypes.first(),
            onFontSelected = {},
            onFontSizeChange = {},
            onFontStyleSelected = {},
            selectedFontSize = 14f,
            onLineHeightChange = {},
            selectedFontHeight = 14f
        )
    }
}

@Composable
fun BookFontSetting(
    modifier: Modifier = Modifier,
    fonts: List<BookFont>,
    selectedFont: BookFont,
    selectedFontStyle: BookFontsStyle,
    onFontSelected: (BookFont) -> Unit,
    onFontStyleSelected: (BookFontsStyle) -> Unit,
    onFontSizeChange: (Float) -> Unit,
    onLineHeightChange: (Float) -> Unit,
    selectedFontSize: Float,
    selectedFontHeight: Float,
) {

    var fontSizeValue by remember { mutableStateOf(selectedFontSize) }
    var fontLineHeightValue by remember { mutableStateOf(selectedFontHeight) }

    Column(
        modifier = modifier
            .clip(RoundedCornerShape(topStart = LargeSpacing, topEnd = LargeSpacing))
            .fillMaxWidth()
            .background(MaterialTheme.colors.surface)
            .padding(horizontal = LargeSpacing),
    ) {
        SpacerHeight(MediumSpacing)
        Text(
            text = stringResource(id = R.string.sizes),
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onBackground
        )
        SpacerHeight(MediumSpacing)
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.Aa),
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onBackground
            )
            SpacerWidth(MediumSpacing)
            BookFontSettingSlider(
                modifier = modifier.weight(1f),
                value = fontSizeValue,
                onValueChange = {
                    fontSizeValue = it
                    onFontSizeChange(fontSizeValue)
                },
                valueRange = 14f..40f,
            )
            SpacerWidth(MediumSpacing)
            Text(
                text = stringResource(id = R.string.Aa),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )
        }
        SpacerHeight(MediumSpacing)

        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = modifier.size(18.dp),
                painter = painterResource(id = R.drawable.line_height_small),
                contentDescription = null,
                tint = MaterialTheme.colors.onBackground
            )
            SpacerWidth(MediumSpacing)
            BookFontSettingSlider(
                modifier = modifier.weight(1f),
                value = fontLineHeightValue,
                onValueChange = {
                    fontLineHeightValue = it
                    onLineHeightChange(fontLineHeightValue)
                },
                valueRange = 18f..60f,
            )
            SpacerWidth(MediumSpacing)
            Icon(
                modifier = modifier.size(18.dp),
                painter = painterResource(id = R.drawable.line_height_big),
                contentDescription = null,
                tint = MaterialTheme.colors.onBackground
            )
        }
        SpacerHeight(LargeSpacing + MediumSpacing)
        Text(
            text = stringResource(id = R.string.fonts),
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.onBackground
        )

        LazyRow(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            items(
                items = fonts,
                key = { item -> item.hashCode() }
            ) { font ->
                StyleItem(
                    modifier = modifier.clickableNoRipple { onFontSelected(font) },
                    title = stringResource(id = R.string.Aa),
                    description = stringResource(id = font.titleId),
                    fontFamily = font.fontFamily(),
                    isSelected = selectedFont == font
                )
            }
        }

        SpacerHeight(LargeSpacing + MediumSpacing)
        Text(
            text = stringResource(id = R.string.style),
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onBackground
        )
        SpacerHeight(MediumSpacing)
        LazyRow(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            items(
                items = selectedFont.fontSubTypes,
                key = { item -> item.hashCode() },
            ) { style ->
                Row {
                    StyleItem(
                        modifier = modifier.clickableNoRipple { onFontStyleSelected(style) },
                        title = stringResource(id = R.string.Aa),
                        description = stringResource(id = style.titleId),
                        fontFamily = style.fontFamily(),
                        isSelected = selectedFontStyle == style
                    )
                    SpacerWidth(LargeSpacing)
                }

            }
        }
        SpacerHeight(LargeSpacing + MediumSpacing)
    }
}

@Composable
fun BookFontSettingSlider(
    modifier: Modifier = Modifier,
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    onValueChange: (Float) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }

    Slider(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        colors = SliderDefaults.colors(
            activeTickColor = MaterialTheme.colors.onBackground,
            activeTrackColor = MaterialTheme.colors.onBackground,
        ),
        interactionSource = interactionSource,
        valueRange = valueRange
    )

}

@Composable
fun StyleItem(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    fontFamily: FontFamily,
    isSelected: Boolean,
) {
    Row {
        SpacerWidth(LargeSpacing + LargeSpacing)
        Column(
            modifier = modifier
                .alpha(if (isSelected) 1f else 0.3f)
                .height(80.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpacerHeight(LargeSpacing)
            Text(
                text = title,
                style = MaterialTheme.typography.h1.copy(
                    fontFamily = fontFamily,
                    color = MaterialTheme.colors.onBackground,
                    fontWeight = FontWeight.Bold
                )
            )
            SpacerHeight(SmallSpacing)
            Text(
                text = description,
                fontFamily = fontFamily,
                color = MaterialTheme.colors.onBackground,
                fontWeight = FontWeight.Bold
            )
        }
        SpacerWidth(LargeSpacing + LargeSpacing)
    }
}