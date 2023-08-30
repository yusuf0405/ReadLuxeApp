package com.joseph.readluxeapp.navigation.routers

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import com.joseph.readluxe.mainscreen.presentation.presentation.MainScreen
import com.joseph.readluxeapp.navigation.routers.ReadingScreenRouter.Companion.READING_SCREEN_ROUTE
import javax.inject.Inject

class MainScreenRouter @Inject constructor() : FeatureRouterApi {

    override fun route(): String = MAIN_SCREEN_ROUTE

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route()) {
            MainScreen(
                navigateToReadingScreen = {
                    navController.navigate(READING_SCREEN_ROUTE)
                }
            )
        }
    }

    companion object {
        const val MAIN_SCREEN_ROUTE = "main_screen_route"
    }
}