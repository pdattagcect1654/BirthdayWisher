package com.example.myapplication

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Input(){
val name = remember {
    mutableStateOf("")
}

    MaterialTheme{
        Surface {
            TextField(value = name.value, onValueChange = {name.value = it})
        }
    }
   
}

@Preview
@Composable
fun InputDemo(){
    Input()
}