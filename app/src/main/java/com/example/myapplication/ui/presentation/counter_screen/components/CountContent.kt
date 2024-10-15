package com.example.myapplication.ui.presentation.counter_screen.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CountContent(buttonLabel: String,textNumber: Int, onClick: () -> Unit) {
    TextDisplay(count = textNumber)
    Spacer(modifier = Modifier.height(16.dp))

    ActionButton(label = buttonLabel, onClick = onClick)
}