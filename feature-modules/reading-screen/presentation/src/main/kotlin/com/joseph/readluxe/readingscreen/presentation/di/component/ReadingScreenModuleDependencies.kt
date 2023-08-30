package com.joseph.readluxe.readingscreen.presentation.di.component

import com.joseph.readluxe.mainscreen.api.BooksRepository

interface ReadingScreenModuleDependencies {

    fun fetchBookRepository(): BooksRepository

}