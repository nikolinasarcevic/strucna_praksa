package com.example.myapplication.ui.presentation.counter_screen.intent

sealed class CounterIntent {
    data object IncrementCount : CounterIntent()
    data object DecrementCount : CounterIntent()
}