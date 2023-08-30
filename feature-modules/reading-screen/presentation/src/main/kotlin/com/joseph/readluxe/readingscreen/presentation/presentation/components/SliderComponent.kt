package com.joseph.readluxe.readingscreen.presentation.presentation.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.joseph.readluxe.core.ui.theme.LargeSpacing
import com.joseph.readluxe.core.ui.theme.MediumSpacing


@Composable
fun CustomSlider(
    modifier: Modifier = Modifier,
    initialValue: MutableState<Int>,
    maxValue: Int,
    valueSetter: (Int) -> Unit
) {
    var value by remember { mutableStateOf(initialValue.value) }
    val interactionSource = remember { MutableInteractionSource() }

    Column(
        modifier = modifier
            .padding(
                horizontal = LargeSpacing + MediumSpacing
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = modifier.height(MediumSpacing))
        Text(
            text = "${initialValue.value} из $maxValue",
            color = MaterialTheme.colors.onBackground
        )

        Slider(
            modifier = modifier,
            value = value.toFloat(),
            onValueChange = { value = it.toInt() },
            onValueChangeFinished = { valueSetter(value) },
            interactionSource = interactionSource,
            valueRange = 1f..maxValue.toFloat(),
            colors = SliderDefaults.colors(
                activeTickColor = MaterialTheme.colors.onBackground,
                activeTrackColor = MaterialTheme.colors.onBackground,
            ),
//            thumb = { position ->
//                SliderDefaults.Thumb(
//                    interactionSource = interactionSource,
//                    thumbSize = DpSize(18.dp, 18.dp),
//                    colors = SliderDefaults.colors(
//                        thumbColor = MaterialTheme.colorScheme.onBackground,
//                    )
//                )
//            },
        )
    }
}