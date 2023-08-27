package com.joseph.readluxeapp.common.navigation.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi

fun NavGraphBuilder.register(
    featureApi: FeatureRouterApi,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    featureApi.registerGraph(
        navGraphBuilder = this,
        navController = navController,
        modifier = modifier
    )
}