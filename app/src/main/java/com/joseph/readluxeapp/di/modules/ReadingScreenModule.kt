package com.joseph.readluxeapp.di.modules

import com.joseph.readluxe.mainscreen.api.BooksRepository
import com.joseph.readluxe.mainscreen.api.MainScreenApi
import com.joseph.readluxe.readingscreen.api.ReadingScreenApi
import com.joseph.readluxe.readingscreen.presentation.di.component.ReadingScreenComponentHolder
import com.joseph.readluxe.readingscreen.presentation.di.component.ReadingScreenModuleDependencies
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ReadingScreenModule {

    @Singleton
    @Provides
    fun providesReadingScreenModuleDependencies(
        mainScreenApi: MainScreenApi
    ) = object : ReadingScreenModuleDependencies {
        override fun fetchBookRepository(): BooksRepository = mainScreenApi.provideBooksRepository()
    }


    @Provides
    fun fetchReadingScreenApi(dependencies: ReadingScreenModuleDependencies): ReadingScreenApi {
        ReadingScreenComponentHolder.init(dependencies)
        return ReadingScreenComponentHolder.readingScreenApi()
    }
}