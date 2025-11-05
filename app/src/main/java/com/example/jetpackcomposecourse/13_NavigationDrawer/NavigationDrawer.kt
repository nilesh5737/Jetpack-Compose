package com.example.jetpackcomposecourse.`13_NavigationDrawer`

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun SimpleBottomNavigation() {


    var selectedIndex by remember { mutableStateOf(0) }


    Column(modifier = Modifier.fillMaxSize()) {


        Text(
            text = when (selectedIndex) {
                0 -> "This is Home Screen"
                1 -> "This is Search Screen"
                else -> "This is Profile Screen"
            },
            modifier = Modifier
                .weight(1f)
                .padding(16.dp)
        )


        NavigationBar {
            NavigationBarItem(
                selected = selectedIndex == 0,
                onClick = { selectedIndex = 0 },
                icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                label = { Text("Home") }
            )

            NavigationBarItem(
                selected = selectedIndex == 1,
                onClick = { selectedIndex = 1 },
                icon = { Icon(Icons.Default.Search, contentDescription = "Search") },
                label = { Text("Search") }
            )

            NavigationBarItem(
                selected = selectedIndex == 2,
                onClick = { selectedIndex = 2 },
                icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                label = { Text("Profile") }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowNavigationBar(){
    SimpleBottomNavigation()
}



