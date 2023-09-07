package com.example.personaldetailsapp.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.personaldetailsapp.presentation.screens.MainScreen
import com.example.personaldetailsapp.presentation.screens.WebViewPage

@Composable
fun Navigation() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = Screens.MainScreen.name
    ){

        composable(route = Screens.MainScreen.name){
            MainScreen(navController = navController, modifier = Modifier.padding(20.dp))
        }

        composable(route = Screens.WebViewScreen.name){
            WebViewPage(url = "https://github.com/Tyronexx")
//            Text(text = "Hello world")
        }
    }
}