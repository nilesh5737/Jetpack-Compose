package com.example.jetpackcomposecourse.`6_Cards`

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CardSample(){

    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Card (
            modifier = Modifier.padding(16.dp),
            colors = CardDefaults.cardColors(Color.Cyan),
           // border = BorderStroke(2.dp,Color.DarkGray),
            elevation = CardDefaults.cardElevation(8.dp)
        ){
            Text(
                text = "Hello, Nilesh",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowCardUI(){
    CardSample()
}
