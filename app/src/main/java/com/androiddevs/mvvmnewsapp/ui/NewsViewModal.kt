package com.androiddevs.mvvmnewsapp.ui

import androidx.lifecycle.ViewModel
import com.androiddevs.mvvmnewsapp.repository.NewsRepository

class NewsViewModal(
    val newsRepository: NewsRepository
) : ViewModel(){
}