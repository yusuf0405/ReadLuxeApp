package com.joseph.readluxe.mainscreen.presentation.di.modules

import com.joseph.readluxe.mainscreen.api.BooksRepository
import com.joseph.readluxe.mainscreen.presentation.data.BooksRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataModule {

    @Binds
    abstract fun bindBooksRepository(
        implementation: BooksRepositoryImpl
    ): BooksRepository

}