package com.example.businessbudgettracker.android

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businessbudgettracker.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButtonLeftTop = findViewById<ImageButton>(R.id.imageButtonLeftTop)
        imageButtonLeftTop.setOnClickListener {
            // Handle the click event
        }

        val imageButtonRightTop = findViewById<ImageButton>(R.id.imageButtonRightTop)
        imageButtonRightTop.setOnClickListener {
            // Handle the click event
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
