package com.example.jetpackcomposecourse.`18_Slider`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun SliderSample(){

    var sliderposition by remember{ mutableStateOf(0f) }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,

    ) {
        Slider(
            value = sliderposition,
            onValueChange = {
                sliderposition = it
            },
            colors = SliderDefaults.colors(
                thumbColor = MaterialTheme.colorScheme.secondary,
                activeTrackColor = MaterialTheme.colorScheme.secondary,
                inactiveTickColor = MaterialTheme.colorScheme.secondaryContainer
            ),
            steps = 3,
            valueRange = 0f..50f
        )
        Text(text = sliderposition.toString())
    }
}

@Preview(showSystemUi = true)
@Composable
fun showSlider(){
    SliderSample()
}

