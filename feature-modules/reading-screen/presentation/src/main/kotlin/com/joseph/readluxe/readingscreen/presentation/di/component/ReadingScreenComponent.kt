package com.joseph.readluxe.readingscreen.presentation.di.component

import com.joseph.readluxe.readingscreen.api.ReadingScreenApi
import com.joseph.readluxe.readingscreen.presentation.di.annotation.ReadingScreenScope
import com.joseph.readluxe.readingscreen.presentation.di.modules.DataModule
import dagger.Component

@Component(
    modules = [
        DataModule::class
    ],
    dependencies = [ReadingScreenModuleDependencies::class]
)
@ReadingScreenScope
internal interface ReadingScreenComponent : ReadingScreenApi {

    companion object {
        fun initAndGet(
            readingScreenModuleDependencies:
            ReadingScreenModuleDependencies
        ): ReadingScreenComponent = DaggerReadingScreenComponent.builder()
            .readingScreenModuleDependencies(readingScreenModuleDependencies)
            .build()
    }
}