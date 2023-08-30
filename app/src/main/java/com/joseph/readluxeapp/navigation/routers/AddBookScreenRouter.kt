package com.joseph.readluxeapp.navigation.routers

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.joseph.readluxe.addbookscreen.presentation.AddBookScreen
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import javax.inject.Inject

class AddBookScreenRouter @Inject constructor() : FeatureRouterApi {

    override fun route(): String = ADD_BOOK_SCREEN_ROUTE

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

    companion object {
        private const val ADD_BOOK_SCREEN_ROUTE = "add_book_screen_route"
    }
}