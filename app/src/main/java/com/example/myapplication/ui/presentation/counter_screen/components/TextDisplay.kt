package com.example.myapplication.ui.presentation.counter_screen.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import timber.log.Timber

@Composable
fun TextDisplay(count: Int) {

    Text(text = "Current count: $count")

    Timber.d("Prikaz countera: $count")
}