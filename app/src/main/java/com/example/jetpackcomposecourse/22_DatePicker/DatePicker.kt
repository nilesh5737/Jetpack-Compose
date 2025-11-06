package com.example.jetpackcomposecourse.`22_DatePicker`


import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.DatePicker
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import  androidx.compose.material3.DatePickerDialog
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DatePickerSample() {

    var selectedDate by remember { mutableStateOf<Long?>(null) }

    var showModal by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        OutlinedTextField(
            value = selectedDate?.let { convertmillisTodateString(it) } ?: "",
            onValueChange = {
            },
            label = {
                Text("DOB")
            },
            placeholder = { Text("MM/DD/YYYY") },
            trailingIcon = {
                Icon(Icons.Default.DateRange, contentDescription = "seletct Date")
            },
            modifier = Modifier
                .fillMaxSize()
                .pointerInput(selectedDate) {
                    awaitEachGesture {
                        awaitFirstDown(pass = PointerEventPass.Initial)
                        val UpEvent = waitForUpOrCancellation(pass = PointerEventPass.Initial)
                        if (UpEvent != null) {
                            showModal = true
                        }
                    }
                }
        )
    }


    if (showModal) {
        DatePickerModal(
            onDateSelected = {
                selectedDate = it

            },
            onDismiss = {
                showModal = false
            }
        )
    }


}


fun convertmillisTodateString(millis: Long): String {
    val formater = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    return formater.format(Date(millis))
}


@Composable
fun DatePickerModal(
    onDateSelected: (Long?) -> Unit,
    onDismiss: () -> Unit
) {
    val datePickerState = rememberDatePickerState()
    DatePickerDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(
                onClick = {
                    onDateSelected(datePickerState.selectedDateMillis)
                    onDismiss
                }
            ) {
                Text("Ok")
            }
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss
            ) {
                Text("Cancel")
            }
        }
    ) {
        DatePicker(state = datePickerState)
    }
}

@Preview(showSystemUi = true)
@Composable
fun showdatePicker(){
    DatePickerSample()
}
