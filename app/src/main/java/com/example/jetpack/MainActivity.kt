package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack.ui.theme.JetpackTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAppContent()

        }
    }//class MainActivity : ComponentAc  () {
}

@Composable
 fun MainAppContent(){
     TextField(value = "VlrInicial" , onValueChange = {})




}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainAppContent()


    }
