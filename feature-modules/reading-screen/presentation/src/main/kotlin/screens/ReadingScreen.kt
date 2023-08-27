package screens

import BookPage
import android.annotation.SuppressLint
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joseph.readluxe.core.ui.theme.LargeSpacing
import com.joseph.readluxe.core.ui.theme.MediumSpacing
import com.joseph.readluxeapp.common.navigation.common.VolumeButtonClickActions
import components.BookFontSetting
import components.CustomSlider
import components.PageItem
import extensions.collectAsEffect
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import models.BookFont
import com.joseph.readluxe.core.ui.R
import com.joseph.readluxe.core.ui.theme.ReadLuxeAppTheme
import models.BookFontsStyle
import java.util.*

private const val ANIMATION_DURATION = 200

@SuppressLint(
    "UnusedMaterial3ScaffoldPaddingParameter",
)
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ReadingScreen(
    modifier: Modifier = Modifier,
    uiState: ReadingScreenUiState,
    onFontSelected: (BookFont) -> Unit,
    onFontStyleSelected: (BookFontsStyle) -> Unit,
    onFontSizeChange: (Float) -> Unit,
    onLineHeightChange: (Float) -> Unit,
    volumeButtonsFlow: Flow<VolumeButtonClickActions>
) {
    val bookPages = BookPage.previews
    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()
    var isShowBottomMenu by remember { mutableStateOf(false) }
    var isShowBookFontSetting by remember { mutableStateOf(false) }
    val currentPage = remember { mutableStateOf(1) }

    volumeButtonsFlow.collectAsEffect { value ->
        when (value) {
            VolumeButtonClickActions.VOLUME_UP -> {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage.inc())
                }
            }

            VolumeButtonClickActions.VOLUME_DOWN -> {
                scope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage.dec())
                }
            }
        }
    }

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            currentPage.value = bookPages[page].page
        }
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        contentAlignment = Alignment.Center
    ) {
        HorizontalPager(
            pageCount = bookPages.size,
            state = pagerState
        ) { index ->
            PageItem(
                page = bookPages[index],
                textStyle = MaterialTheme.typography.h1.copy(
                    color = MaterialTheme.colors.onBackground
                ),
                selectedFontSize = uiState.selectedFontSize.toInt(),
                selectedFontStyle = uiState.selectedFontsStyle,
                selectedLineHeight = uiState.selectedLineHeight.toInt(),
                onClick = {
                    isShowBottomMenu = !isShowBottomMenu
                    isShowBookFontSetting = false
                },
                openNextPage = {
                    scope.launch {
                        pagerState.animateScrollToPage(pagerState.currentPage.inc())
                    }
                },
                openPreviousPage = {
                    scope.launch {
                        pagerState.animateScrollToPage(pagerState.currentPage.dec())
                    }
                }
            )
        }

        OptionsComponents(
            modifier = modifier.align(Alignment.BottomCenter),
            currentPage = currentPage,
            isShowBottomMenu = isShowBottomMenu,
            maxPages = bookPages.size,
            pagerState = pagerState,
            onSettingClick = {
                scope.launch {
                    isShowBottomMenu = false
                    delay(300)
                    isShowBookFontSetting = true

                }
            },
        )

        AnimatedVisibility(
            visible = isShowBookFontSetting,
            modifier = modifier
                .padding(bottom = LargeSpacing)
                .align(Alignment.BottomCenter),
            exit = slideOutVertically(
                targetOffsetY = {
                    it / 2
                },
                animationSpec = keyframes {
                    this.durationMillis = ANIMATION_DURATION
                }
            ),
            enter = slideInVertically(
                initialOffsetY = {
                    it / 2
                },
                animationSpec = keyframes {
                    this.durationMillis = ANIMATION_DURATION
                }
            )
        ) {
            BookFontSetting(
                fonts = uiState.fonts,
                selectedFont = uiState.selectedFont,
                selectedFontStyle = uiState.selectedFontsStyle,
                selectedFontSize = uiState.selectedFontSize,
                selectedFontHeight = uiState.selectedLineHeight,
                onFontSelected = onFontSelected,
                onFontStyleSelected = onFontStyleSelected,
                onFontSizeChange = onFontSizeChange,
                onLineHeightChange = onLineHeightChange
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OptionsComponents(
    modifier: Modifier,
    currentPage: MutableState<Int>,
    isShowBottomMenu: Boolean,
    maxPages: Int,
    pagerState: PagerState,
    onSettingClick: () -> Unit
) {
    val scope = rememberCoroutineScope()

    AnimatedVisibility(
        modifier = modifier.padding(bottom = LargeSpacing),
        visible = isShowBottomMenu,
        exit = slideOutVertically(
            targetOffsetY = {
                it / 2
            },
            animationSpec = keyframes {
                this.durationMillis = ANIMATION_DURATION
            }
        ),
        enter = slideInVertically(
            initialOffsetY = {
                it / 2
            },
            animationSpec = keyframes {
                this.durationMillis = ANIMATION_DURATION
            }
        )
    ) {
        Card(
            modifier = modifier
                .clip(RoundedCornerShape(topStart = LargeSpacing, topEnd = LargeSpacing)),
            backgroundColor = MaterialTheme.colors.surface,
            elevation = 12.dp
        ) {
            Column(
                modifier = modifier
            ) {
                CustomSlider(
                    initialValue = currentPage,
                    maxValue = maxPages,
                    valueSetter = { page ->
                        if (page != pagerState.currentPage) {
                            scope.launch {
                                pagerState.animateScrollToPage(page)
                            }
                        }
                    }
                )
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            bottom = LargeSpacing + MediumSpacing,
                            top = LargeSpacing
                        ),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Icon(
                        modifier = modifier.size(32.dp),
                        painter = painterResource(id = R.drawable.category_icon),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onBackground
                    )

                    Icon(
                        modifier = modifier
                            .size(32.dp)
                            .clickable { onSettingClick() },
                        painter = painterResource(id = R.drawable.setting_icon),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onBackground
                    )

                    Icon(
                        modifier = modifier.size(32.dp),
                        painter = painterResource(id = R.drawable.like_icon),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onBackground
                    )

                    Icon(
                        modifier = modifier.size(32.dp),
                        painter = painterResource(id = R.drawable.save_icon),
                        contentDescription = null,
                        tint = MaterialTheme.colors.onBackground
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ReadingScreenPreview() {
    ReadLuxeAppTheme {
        ReadingScreen(
            uiState = ReadingScreenUiState(),
            onFontSelected = {},
            onFontSizeChange = {},
            onFontStyleSelected = {},
            onLineHeightChange = {},
            volumeButtonsFlow = flowOf()
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ReadingScreenNightPreview() {
    ReadLuxeAppTheme {
        ReadingScreen(
            uiState = ReadingScreenUiState(),
            onFontSelected = {},
            onFontSizeChange = {},
            onFontStyleSelected = {},
            onLineHeightChange = {},
            volumeButtonsFlow = flowOf()
        )
    }
}

