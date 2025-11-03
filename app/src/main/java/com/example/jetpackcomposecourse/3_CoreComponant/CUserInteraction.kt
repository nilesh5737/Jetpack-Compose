package com.example.jetpackcomposecourse.`3_CoreComponant`

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextDecoration


@Composable
fun PartialSelectableText(){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        SelectionContainer {
            Column {

                Text("This is a selectable text")
                Text("This is one two")
                Text("hg nhjbuydfw fdewf")

                DisableSelection {
                    Text("Not selectable text")
                    Text("Not selectable text")
                }
            }
        }
    }
}


@Composable
fun ClickableUrlText(){
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

            Text(
                text = "Visit Google",
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable{
                    val intent = Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com"))

                    context.startActivity(intent)
                }
            )
        }
    }





//@Preview(showSystemUi = true)
//@Composable
//fun ShowPreview1(){
//    partialSelectableText()
//}

