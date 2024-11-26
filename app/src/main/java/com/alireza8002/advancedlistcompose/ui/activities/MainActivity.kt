package com.alireza8002.advancedlistcompose.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.alireza8002.advancedlistcompose.ui.screens.ProductsScreen
import com.alireza8002.advancedlistcompose.ui.theme.AdvancedListComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val isDarkTheme = remember { mutableStateOf(false) }
            AdvancedListComposeTheme(darkTheme = isDarkTheme.value) {
                ProductsScreen(isDarkTheme)
            }
        }
    }
}