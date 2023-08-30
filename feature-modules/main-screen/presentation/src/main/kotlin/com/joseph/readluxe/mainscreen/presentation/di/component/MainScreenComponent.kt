package com.joseph.readluxe.mainscreen.presentation.di.component

import com.joseph.readluxe.mainscreen.api.MainScreenApi
import com.joseph.readluxe.mainscreen.presentation.di.annotation.MainScreenScope
import com.joseph.readluxe.mainscreen.presentation.di.modules.DataModule
import dagger.Component

@Component(
    modules = [
        DataModule::class
    ],
    dependencies = [MainScreenModuleDependencies::class]
)
@MainScreenScope
internal interface MainScreenComponent : MainScreenApi {

    companion object {
        fun initAndGet(mainScreenModuleDependencies: MainScreenModuleDependencies): MainScreenComponent =
            DaggerMainScreenComponent.builder()
                .mainScreenModuleDependencies(mainScreenModuleDependencies)
                .build()
    }
}