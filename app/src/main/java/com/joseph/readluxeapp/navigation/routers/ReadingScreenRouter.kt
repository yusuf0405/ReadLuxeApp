package com.joseph.readluxeapp.navigation.routers

import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import screens.ReadingScreen
import screens.ReadingScreenViewModel
import javax.inject.Inject

class ReadingScreenRouter @Inject constructor() : FeatureRouterApi {
    override fun route(): String = "reading_screen"

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
}