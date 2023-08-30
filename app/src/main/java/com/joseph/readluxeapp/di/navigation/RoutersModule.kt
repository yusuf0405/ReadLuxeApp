package com.joseph.readluxeapp.di.navigation

import com.joseph.readluxe.core.common.navigation.FeatureRouterApi
import com.joseph.readluxeapp.navigation.routers.AddBookScreenRouter
import com.joseph.readluxeapp.navigation.routers.MainScreenRouter
import com.joseph.readluxeapp.navigation.routers.OnboardingScreenRouter
import com.joseph.readluxeapp.navigation.routers.ReadingScreenRouter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(ViewModelComponent::class)
abstract class RoutersModule {

    @IntoSet
    @Binds
    @Routers
    abstract fun bindAddBookScreenRouter(
        implementation: AddBookScreenRouter
    ): FeatureRouterApi

    @IntoSet
    @Binds
    @Routers
    abstract fun bindReadingScreenRouter(
        implementation: ReadingScreenRouter
    ): FeatureRouterApi

    @IntoSet
    @Binds
    @Routers
    abstract fun bindHomeScreenRouter(
        implementation: MainScreenRouter
    ): FeatureRouterApi

    @IntoSet
    @Binds
    @Routers
    abstract fun bindOnboardingScreenRouter(
        implementation: OnboardingScreenRouter
    ): FeatureRouterApi
}