package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Birthday(){
MaterialTheme{
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.Yellow){
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(text = "Happy Birthday",
                fontFamily = FontFamily.Cursive,
                fontSize = 50.sp,
                color = Color.Blue

            )

            Text(
                text = "Piyali",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Red

            )
        }
    }
}
}
@Preview
@Composable
fun BirthdayTest(){
Birthday()
}
