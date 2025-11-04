package com.example.jetpackcomposecourse.`10_FloatingButton`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun FloatingButtonExapmle() {

    Scaffold(

        floatingActionButton = {
            FloatingActionButton(     // we can show only symbol
                onClick = {/*TODO*/ }
            ) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center
        ) {
            Text("Floating Button Example")
        }
    }

}

@Composable
fun ExtendedFABExample() {
    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(   // we can show both icon and text
                onClick = { },
                containerColor = Color.DarkGray,
                contentColor = Color.White,
                icon = { Icon(Icons.Default.Add, contentDescription = "Add") },
                text = {
                    Text("ADD Item")
                }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center
        ) {
            Text("Floating Button Example")
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun showButtonUI() {
    ExtendedFABExample()
}