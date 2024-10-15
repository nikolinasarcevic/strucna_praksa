package com.example.myapplication.ui.presentation.counter_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor() : ViewModel() {
    private var _count by mutableIntStateOf(0)
    private var _count2 by mutableIntStateOf(100)

    val count: Int
        get() = _count

    val count2: Int
        get() = _count2


    fun incrementCount() {
        _count++
        Timber.d("counter incr: $(_count)")
    }

    fun decrementCount() {
        if(_count2 == 0){
            _count2 = 100
        } else _count2--
        Timber.d("counter incr: $(_count2)")
    }

}