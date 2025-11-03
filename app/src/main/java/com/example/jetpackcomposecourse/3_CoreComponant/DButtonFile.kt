package com.example.jetpackcomposecourse.`3_CoreComponant`

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// Filled Button

@Composable
fun FilledButtonSample(){
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.CenterHorizontally)
        ){
            Button(     // Primary Button - used for important action
                onClick = {
                    Toast.makeText(context,"Button is clicked", Toast.LENGTH_SHORT).show()
                }
            ) {
                Text("Submit")
            }


            FilledTonalButton(   // Secondary Button - Used for secondary or less important action
                onClick = {
                    Toast.makeText(context,"Button is clicked", Toast.LENGTH_SHORT).show()
                }
            ){
                Text("Cancel")
            }

//            OutlinedButton(   // Outlined Button
//                onClick = {
//                    Toast.makeText(context,"Button is clicked", Toast.LENGTH_SHORT).show()
//                }
//            ){
//                Text("OutlinedButton")
//            }

            ElevatedButton(   // Elevated Button - lokks raised with a shadow
                onClick = {
                    Toast.makeText(context,"Button is clicked", Toast.LENGTH_SHORT).show()
                }
            ) {
                Text("Save")
            }

            TextButton(
                onClick = {}
            ) {
                Text("Clike me")
            }

        }

    }

}


@Preview(showSystemUi = true)
@Composable
fun ShowSystem(){
    FilledButtonSample()
}