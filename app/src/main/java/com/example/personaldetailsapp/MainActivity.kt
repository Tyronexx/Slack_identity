package com.example.personaldetailsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.personaldetailsapp.presentation.navigation.Navigation
import com.example.personaldetailsapp.presentation.screens.MainScreen
import com.example.personaldetailsapp.presentation.screens.WebViewPage
import com.example.personaldetailsapp.ui.theme.PersonalDetailsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalDetailsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    MainScreen(modifier = Modifier.padding(20.dp))
//                    WebViewPage(url = "https://github.com/Tyronexx")
                    Navigation()
                }
            }
        }
    }
}
