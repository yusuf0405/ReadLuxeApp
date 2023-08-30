package com.joseph.readluxe.readingscreen.presentation.di.component

import com.joseph.readluxe.readingscreen.api.ReadingScreenApi


object ReadingScreenComponentHolder {

    private var component: ReadingScreenComponent? = null

    fun init(
        dependencies: ReadingScreenModuleDependencies
    ) {
        if (component == null) {
            synchronized(this) {
                if (component == null) {
                    component = ReadingScreenComponent.initAndGet(dependencies)
                }
            }
        }
    }


    fun readingScreenApi(): ReadingScreenApi = checkNotNull(component)
}