package com.joseph.readluxeapp.navigation.routers

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.joseph.readluxeapp.HomeScreen
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import javax.inject.Inject

class HomeScreenRouter @Inject constructor()  : FeatureRouterApi {

    override fun route(): String = "home_screen"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route()) {
            HomeScreen()
        }
    }
}