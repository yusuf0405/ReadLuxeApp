package com.joseph.readluxeapp.navigation.routers

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import screens.AddBookScreen
import javax.inject.Inject

class AddBookScreenRouter @Inject constructor() : FeatureRouterApi {

    override fun route(): String = "add_book_screen"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route()) {
            AddBookScreen(
                modifier = modifier,
            )
        }
    }
}