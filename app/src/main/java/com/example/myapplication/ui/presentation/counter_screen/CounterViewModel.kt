package com.example.myapplication.ui.presentation.counter_screen

import androidx.lifecycle.ViewModel
import com.example.myapplication.ui.presentation.counter_screen.intent.CounterIntent
import com.example.myapplication.ui.presentation.counter_screen.intent.CounterState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class CounterViewModel @Inject constructor() : ViewModel() {
    private var _state = MutableStateFlow(CounterState())

    val state: StateFlow<CounterState>
        get() = _state

    fun processIntent(intent: CounterIntent) {
        when (intent) {
            CounterIntent.IncrementCount -> incrementCount()
            CounterIntent.DecrementCount -> decrementCount()
        }
    }

    private fun incrementCount() {
        _state.update { state -> state.copy(count = _state.value.count + 1) }
//        Timber.d("counter incr: ${_state.count}")
    }

    private fun decrementCount() {
        _state.update { currentState ->
            val newCount2 = if (currentState.count2 == 0) {
                100
            } else {
                currentState.count2 - 1
            }
            currentState.copy(count2 = newCount2)
        }
        Timber.d("counter decr: ${_state.value.count2}")

    }
//        Timber.d("counter decr: ${_state.count2}")
//    }
}