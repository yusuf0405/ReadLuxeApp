package com.joseph.readluxe.readingscreen.presentation.di.modules

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataModule {

//    @Binds
//    abstract fun bindBooksRepository(
//        implementation: BooksRepositoryImpl
//    ): BooksRepository

}