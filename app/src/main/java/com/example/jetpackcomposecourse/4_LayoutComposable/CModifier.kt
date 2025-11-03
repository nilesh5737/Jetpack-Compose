package com.example.jetpackcomposecourse.`4_LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// Modifiers - available in all composable function like text, button, column, row, box

@Composable
fun ModifierSample(){
    Box(
         modifier = Modifier.fillMaxSize()
             .background(Color.Red)
             .padding(16.dp),
       
    ){

    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowPreview_1(){
    ModifierSample()
}
