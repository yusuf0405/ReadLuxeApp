package com.joseph.readluxeapp.navigation.routers

import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import com.joseph.readluxe.readingscreen.presentation.presentation.screens.ReadingScreen
import com.joseph.readluxe.readingscreen.presentation.presentation.screens.ReadingScreenViewModel
import javax.inject.Inject

class ReadingScreenRouter @Inject constructor() : FeatureRouterApi {

    override fun route(): String = READING_SCREEN_ROUTE

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route()) {
            val viewModel: ReadingScreenViewModel = hiltViewModel()
            ReadingScreen(
                uiState = viewModel.uiState,
                onFontSizeChange = viewModel::onSelectedFontSize,
                onFontStyleSelected = viewModel::onSelectedFontStyle,
                onFontSelected = viewModel::onSelectedFont,
                onLineHeightChange = viewModel::onLineHeightChange,
                volumeButtonsFlow = viewModel.volumeButtonsFlow()
            )
        }
    }

    companion object {
        const val READING_SCREEN_ROUTE = "reading_screen_route"
    }
}