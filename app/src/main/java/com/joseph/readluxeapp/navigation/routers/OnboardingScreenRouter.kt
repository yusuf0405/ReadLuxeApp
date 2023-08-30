package com.joseph.readluxeapp.navigation.routers

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import com.joseph.readluxe.onboarding.presentation.OnboardingScreen
import javax.inject.Inject

class OnboardingScreenRouter @Inject constructor() : FeatureRouterApi {

    override fun route(): String = ONBOARDING_SCREEN_ROUTE

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(route()) {
            OnboardingScreen()
        }
    }

    companion object {
        const val ONBOARDING_SCREEN_ROUTE = "onboarding_screen_route"
    }
}