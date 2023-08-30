package com.joseph.readluxeapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import com.joseph.readluxe.core.common.navigation.register


@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    routers: List<FeatureRouterApi>,
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        routers.forEach { router ->
            register(
                router,
                navController = navController,
                modifier = modifier
            )
        }
    }
}
