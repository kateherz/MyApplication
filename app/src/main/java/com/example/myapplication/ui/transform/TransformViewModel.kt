package com.example.myapplication.ui.transform

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TransformViewModel : ViewModel() {

    private val _texts = MutableLiveData<List<String>>().apply {
        value = (1..8).mapIndexed { _, i ->
            "h"
        }
    }

    val texts: LiveData<List<String>> = _texts
}