package com.joseph.readluxe.mainscreen.presentation.presentation

import androidx.lifecycle.ViewModel
import com.joseph.readluxe.mainscreen.presentation.data.BooksService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val booksService: BooksService
) : ViewModel() {
}