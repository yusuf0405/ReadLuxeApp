package com.joseph.readluxeapp.di.modules

import com.joseph.readluxe.mainscreen.api.MainScreenApi
import com.joseph.readluxe.mainscreen.presentation.di.component.MainScreenComponentHolder
import com.joseph.readluxe.mainscreen.presentation.di.component.MainScreenModuleDependencies
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainScreenModule {

    @Singleton
    @Provides
    fun providesMainScreenModuleDependencies() = object : MainScreenModuleDependencies {

    }


    @Provides
    fun fetchMainScreenApi(dependencies: MainScreenModuleDependencies): MainScreenApi {
        MainScreenComponentHolder.init(dependencies)
        return MainScreenComponentHolder.mainScreenApi()
    }
}