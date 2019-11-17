package com.example.meilolbook.ui.Popular

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PopularViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is popular Fragment"
    }
    val text: LiveData<String> = _text
}