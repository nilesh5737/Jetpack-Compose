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
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FloatingButtonExample() {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Action */ }) {
                Icon(
                    imageVector = Icons.Default.Add,
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
            Text("Normal Floating Action Button")
        }
    }
}

@Composable
fun ExtendedFABExample() {

    Scaffold(
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { /* Action */ },
                icon = { Icon(Icons.Default.Add, contentDescription = "Add") },
                text = { Text("Add Item") }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center
        ) {
            Text("Extended Floating Action Button")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowPreview() {
    ExtendedFABExample()
}
