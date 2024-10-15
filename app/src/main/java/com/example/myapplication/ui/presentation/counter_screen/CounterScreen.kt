package com.example.myapplication.ui.presentation.counter_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.presentation.counter_screen.components.CountContent

@Composable
fun CounterScreen(viewModel: CounterViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CountContent("Increment Count", textNumber = viewModel.count, onClick = { viewModel.incrementCount() })

            Spacer(modifier = Modifier.height(10.dp))

            CountContent("Decrement Count", textNumber = viewModel.count2, onClick = { viewModel.decrementCount() })
        }
    }
}

