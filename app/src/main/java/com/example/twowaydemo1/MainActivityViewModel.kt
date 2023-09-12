package com.example.twowaydemo1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    val username = MutableLiveData<String>()

    init {
        username.value = "Frank"
    }
}