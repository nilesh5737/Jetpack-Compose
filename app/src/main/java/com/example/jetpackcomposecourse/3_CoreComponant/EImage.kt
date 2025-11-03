package com.example.jetpackcomposecourse.`3_CoreComponant`

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecourse.R


@Composable
fun ImageSample(){

    val rainbowColors = remember {
        Brush.sweepGradient(
            listOf(
                Color.Blue,
                Color.Black,
                Color.Yellow,
                Color.Red,
                Color.Cyan,
                Color.Magenta
            )
        )
    }

     val borderWidth = 10.dp

    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable.portfolio),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(200.dp)
//            .clip(CircleShape)
                .border(BorderStroke(borderWidth, rainbowColors)),
            alignment = Alignment.Center
        )
    }

}


@Preview(showSystemUi = true)
@Composable
fun showUser(){
    ImageSample()
}