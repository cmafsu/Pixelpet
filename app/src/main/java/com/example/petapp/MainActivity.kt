@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.petapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.petapp.ui.theme.PETappTheme
import com.example.petapp.Screens.HomeScreen
import com.example.petapp.Screens

class MainActivity : ComponentActivity() {
    private lateinit var newPet: Pet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // create pet instance
        newPet = Pet("Bingo")
        setContent {
            PETappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "home") {
                        composable("home") { Screens.HomeScreen(navController) }
                        composable("petStats") { Screens.PetStatsScreen(newPet) }
                        composable("settings") { Screens.settingsScreen()}
                    }
                }
            }
        }


    }
}