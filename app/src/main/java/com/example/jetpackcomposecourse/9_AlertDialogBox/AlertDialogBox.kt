package com.example.jetpackcomposecourse.`9_AlertDialogBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlertDialogBoxSample(){

    var showDialog by remember { mutableStateOf(false) }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Button(
            onClick = { showDialog = true}
        ) {
            Text("Show Alert Dialog")
        }

        if(showDialog){

            AlertDialog(
                onDismissRequest = {
                    showDialog = false
                },
                title = { Text("Alert")},
                text = {Text("Do you want to continue ?")},
                confirmButton = {
                    TextButton(
                        onClick ={showDialog = false }
                    ) {
                        Text("Yes")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick ={showDialog = false }
                    ) {
                        Text("No")
                    }
                }
            )
        }
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun showAlertDialogBoxUI(){
//    AlertDialogBoxSample()
//}

