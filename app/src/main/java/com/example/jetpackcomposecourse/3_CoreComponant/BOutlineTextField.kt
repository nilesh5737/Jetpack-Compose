package com.example.jetpackcomposecourse.`3_CoreComponant`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun SimpleOutlinedTextField() {
    var text by remember { mutableStateOf("") }
    val rainbowcolors = listOf(
        Color.Red,
        Color.Cyan,
        Color.Yellow,
        Color.Blue,
        Color.Magenta,
        Color.Green
    )

    val brush = remember {
        Brush.linearGradient(
            colors = rainbowcolors
        )
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = {
                Text("Enter your name")
            }
        )

        TextField(
            value = text,
            onValueChange = { text = it },
            textStyle = TextStyle(brush = brush)
        )
    }

}

// Password Textfield

@Composable
fun PasswordTextFieldSample() {
    var password by rememberSaveable { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            value = password,
            onValueChange = { password = it },
            label = {
                Text("Enter Password")
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )

        )
    }

}


@Preview(showSystemUi = true)
@Composable
fun ShowPreview() {
    PasswordTextFieldSample()
}