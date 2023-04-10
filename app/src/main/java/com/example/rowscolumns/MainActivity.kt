package com.example.rowscolumns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rowscolumns.ui.theme.RowsColumnsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowsColumnsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        modifier = Modifier
            .padding(16.dp)

    ) {
        Text(
            text = "Primeiro",
            modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxWidth()

        )
        Text(
            text = "Segundo",
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.DarkGray)
        )
        Spacer(modifier = Modifier.size(16.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .background(color = Color.Cyan)
                .fillMaxWidth()
                .padding(top = 32.dp)
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Texto 1")
                
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Texto 2")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    RowsColumnsTheme {
        App()
    }
}