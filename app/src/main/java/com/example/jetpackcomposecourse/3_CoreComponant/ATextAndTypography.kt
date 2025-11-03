package com.example.jetpackcomposecourse.`3_CoreComponant`

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun SimpleText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello Jetpack Compose",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(color = Color.Black, blurRadius = 20f)
            )
        )
    }

}

@Composable
fun ColorFullText(){

    val rainbowColors = listOf(
        Color.Blue,
        Color.Black,
        Color.Yellow,
        Color.Red,
        Color.Cyan,
        Color.Magenta
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = buildAnnotatedString {
                append("do not allow people to dim your shine\n")
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainbowColors
                        )
                    )
                ){
                    append("Because they are blinded")
                }

                append("\n tell them to put some sunglasses on")
            }
        )
    }

}


@Composable
fun ScrollableText(){

    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "dsfsf ewfesdc hyjt e g e rfge  reg effbh  reteewrg ghygd sdgthcfhyh",
            modifier = Modifier.basicMarquee(),
            fontSize = 30.sp
        )
    }
}

@Composable
fun textOverflow(){

    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "dsfsf ewfesdc hyjt e g e rfge  reg effbh  reteewrg ghygd sdgthcfhyh".repeat(50),
            maxLines = 2,
            fontSize = 30.sp,
            overflow = TextOverflow.Ellipsis

        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun SimpleTextPreview() {
    textOverflow()
}

