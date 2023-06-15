package com.example.jetpackcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackcomposeui.ui.theme.JetpackComposeUITheme
import com.example.jetpackcomposeui.ui.theme.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeUITheme {
                MainScreen()
            }
        }
    }
}