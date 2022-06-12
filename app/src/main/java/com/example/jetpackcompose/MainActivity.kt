package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          MyComponent()
        }
    }
}
@Composable
fun myImage(){
    Image(painterResource(R.drawable.ic_launcher_foreground), "Imagen de prueba")
}
@Composable
fun MyComponent(){
    Row {
        myImage()
        myTexts()
    }
}

@Composable
fun myTexts(){
    Column() {
        myText("¡Hola Jetpack Compose!")
        myText("¿Preparado?")
    }
}

@Composable
fun myText(text: String){
    Text(text)
}


@Preview
@Composable
fun PreviewTexts(){
    MyComponent()
}
