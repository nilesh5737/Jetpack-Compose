package com.example.jetpackcomposecourse.`4_LayoutComposable`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


// 1. Column, it allows you to place its children in vertical sequence

@Composable
fun ColumnSample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")


    }
}


// 2. Row, it allows you to place its children in horizontal sequence

@Composable
fun RowSample() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")
    }
}


// 3. Box,

@Composable
fun BoxSample(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
          Box(
              modifier = Modifier
                  .size(200.dp)
                  .background(Color.Yellow),

          ) {  }

        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Red),

            ) {  }

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue),

            ) {  }

        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Green),

            ) {  }
    }
}


// 4. ConstraintLayout : use Only when needed and UI is Complex

@Composable
fun ConstraintLayoutSample() {

    Column(){
        ConstraintLayout (
            modifier = Modifier.fillMaxWidth()
                .height(100.dp)
                .background(Color.Magenta)
        ){
            val(text1, text2, text3) = createRefs()
            Text(
                "Bottom Left",
                modifier = Modifier.constrainAs(text1){
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                    start.linkTo(parent.start, margin = 8.dp)
                }
            )

            Text(
                "center Left",
                modifier = Modifier.constrainAs(text2){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end, margin = 16.dp)
                }
            )

            Text(
                "Top Right",
                modifier = Modifier.constrainAs(text3){
                    top.linkTo(parent.top)
                    end.linkTo(parent.end, margin = 8.dp)
                }
            )

        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun ShowPreview() {
//    ColumnSample()
//    RowSample()
//    BoxSample()
    ConstraintLayoutSample()
}