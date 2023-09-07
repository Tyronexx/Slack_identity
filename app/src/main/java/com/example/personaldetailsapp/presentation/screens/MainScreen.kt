package com.example.personaldetailsapp.presentation.screens

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.personaldetailsapp.R
import com.example.personaldetailsapp.presentation.navigation.Screens

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
/*
    Surface (
        modifier = modifier
            .padding(10.dp).border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(20)).fillMaxSize(),
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Black,
//        ),
        color = Color.LightGray
    ){
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "Test")
            Text(text = "Test")
            Text(text = "Test")
        }
    }


 */

    ElevatedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 100.dp,
        ),
        modifier = modifier.fillMaxSize(),
//        border = BorderStroke(width = 2.dp, ),
//        shape = RoundedCornerShape(5.dp),
    ) {
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ){

            Text(
                text = "Richard Ikenna",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold
                )

            )

            Image(
                painter = painterResource(id = R.drawable.slackdp),
                contentDescription = "My Display Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(250.dp)
                    .clip(RoundedCornerShape(20.dp))
            )

            Button(
                onClick = {
                    navController.navigate(Screens.WebViewScreen.name)
                }
            ) {
                Text(
                    text = "Open Github",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.inverseOnSurface
                    )
                )
            }

        }
    }
}