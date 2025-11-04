package com.example.jetpackcomposecourse.`7_CheckBox`

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CheckBoxSample(){
   var checked by remember { mutableStateOf(false) }

    Row (
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it}
        )

        Text(text = if(checked) "Checked" else "unchecked")
    }
}

@Composable
fun SubjectSelection(){

    val subject = listOf("Math","Science","English","Computer")
    val selectedSubjects = remember { mutableStateListOf<String>() }

    Column(
        modifier = Modifier.padding(16.dp)
            .padding(top = 40.dp)
    ){
        Text(text = "Select Subject : ",
            style = MaterialTheme.typography.titleMedium
             )

        Spacer(modifier = Modifier.height(20.dp))

        subject.forEach { subject ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                 modifier = Modifier.padding(8.dp)
            ){
                val checked = subject in selectedSubjects

                Checkbox(
                    checked = checked,
                    onCheckedChange = {
                        if(it) selectedSubjects.add(subject) else selectedSubjects.remove(subject)
                    }
                )

                Text(text = subject,
                    modifier = Modifier.padding(start = 8.dp))
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Selected Subjects : ${selectedSubjects.joinToString()}"
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowCheckBoxUI(){
    SubjectSelection()
}

