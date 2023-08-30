package com.joseph.readluxe.addbookscreen.presentation

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joseph.readluxe.core.ui.R
import com.joseph.readluxe.core.ui.theme.ReadLuxeAppTheme


@Composable
fun AddBookScreen(
    modifier: Modifier = Modifier,
    ) {
    LazyColumn(
        modifier
            .background(MaterialTheme.colors.background)
            .fillMaxSize()
    ) {
        item {
            NavigationBar()
        }
    }
}

@Composable
internal fun NavigationBar(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .padding(top = 16.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = modifier
                .clip(
                    RoundedCornerShape(
                        topEnd = 16.dp,
                        bottomEnd = 16.dp
                    )
                )
                .background(MaterialTheme.colors.onBackground)
                .width(100.dp)

        ) {
            Icon(
                modifier = modifier
                    .padding(vertical = 16.dp)
                    .padding(start = 24.dp),
                painter = painterResource(id = R.drawable.back_icon),
                contentDescription = null,
                tint = MaterialTheme.colors.background
            )
        }

    }
}


@Preview
@Composable
fun AddBookScreenPreviewLight() {
    ReadLuxeAppTheme {
        AddBookScreen()
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun AddBookScreenPreviewNight() {
    ReadLuxeAppTheme {
        AddBookScreen()
    }
}

























