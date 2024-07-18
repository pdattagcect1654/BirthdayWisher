package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun Input(navcontroller:NavController){
val name = remember {mutableStateOf("")
}


        MaterialTheme{
            Surface(modifier = Modifier.fillMaxSize(),
                color = Color.Yellow) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        value = name.value,
                        onValueChange = { name.value = it },
                        label = {
                            Text(text = "Enter a name")
                        }
                    )

                    Button(onClick = { navcontroller.navigate("birthday/${name.value}") }) {
                        Text(text = "Enter")
                    }
                }
            }
            }

        }

   


@Preview
@Composable
fun InputDemo(){
    Input(navcontroller = NavController(context = LocalContext.current))
}