package com.joseph.readluxe.mainscreen.presentation.di.component

import com.joseph.readluxe.mainscreen.api.MainScreenApi


object MainScreenComponentHolder {

    private var component: MainScreenComponent? = null

    fun init(
        dependencies: MainScreenModuleDependencies
    ) {
        if (component == null) {
            synchronized(this) {
                if (component == null) {
                    component = MainScreenComponent.initAndGet(dependencies)
                }
            }
        }
    }


    fun mainScreenApi(): MainScreenApi = checkNotNull(component)
}