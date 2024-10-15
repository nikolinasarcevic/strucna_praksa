package com.example.myapplication.ui.presentation.counter_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.myapplication.ui.presentation.counter_screen.components.CountContent
import com.example.myapplication.ui.presentation.counter_screen.intent.CounterIntent

@Composable
fun CounterScreen(viewModel: CounterViewModel) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CountContent("Increment Count", textNumber = state.count, onClick = { viewModel.processIntent(CounterIntent.IncrementCount) })

            Spacer(modifier = Modifier.height(10.dp))

            CountContent("Decrement Count", textNumber = state.count2, onClick = { viewModel.processIntent(CounterIntent.DecrementCount) })
        }
    }
}

