package com.example.jetpackcomposecourse.`11_Menu`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun DropDownmenuSample() {
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ) {
        IconButton(
            onClick = { expanded = true }
        ) {
            Icon(Icons.Default.MoreVert, contentDescription = "This is 3 dots")
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },

            ) {
            DropdownMenuItem(
                text = { Text("Profile") },
                trailingIcon = {Icon(Icons.Default.Person, contentDescription = "Profile")},
                onClick = {}
            )

            DropdownMenuItem(
                text = { Text("Setting") },
                trailingIcon = {Icon(Icons.Default.Settings, contentDescription = "setting")},
                onClick = {}
            )

            HorizontalDivider()

            DropdownMenuItem(
                text = { Text("Contact") },
                trailingIcon = {Icon(Icons.Default.Call, contentDescription = "Contact")},
                onClick = {}
            )

            HorizontalDivider()

            DropdownMenuItem(
                text = { Text("About") },
                trailingIcon = {Icon(Icons.Default.AccountCircle, contentDescription = "Profile")},
                onClick = {}
            )




        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun showmenu(){
    DropDownmenuSample()
}

