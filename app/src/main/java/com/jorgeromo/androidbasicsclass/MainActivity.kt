package com.jorgeromo.androidbasicsclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jorgeromo.androidbasicsclass.ui.navigation.AppNavigation
import com.jorgeromo.androidbasicsclass.ui.theme.AndroidBasics2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasics2Theme {
                AppNavigation()

            }
        }
    }
}
