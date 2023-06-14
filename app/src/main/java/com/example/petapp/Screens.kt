@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.petapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue


object Screens {
    @Composable
    fun HomeScreen(navController: NavController) {
        Column {
            Button(
                onClick = { navController.navigate("petStats") }
            ) {
                Text(text = "New Pet")
            }
            Button(
                onClick = { navController.navigate("petStats") }
            ) {
                Text(text = "Load Pet")
            }
            Button(
                onClick = { navController.navigate("petStats") }
            ) {
                Text(text = "Shop")
            }
        }
    }

    @Composable
    fun PetStatsScreen(pet: Pet) {
        var newName by remember { mutableStateOf(pet.name)}
        Column {
            TextField(
                value = newName,
                onValueChange = { newName = it },
                label = {Text ("Enter Your New Pets Name")}
            )
            Button(
                onClick =  {
                    if(pet.name.isNotBlank()){
                        pet.name = newName;
                    }
                }
            ){
                Text(text = "Save Name")
            }
            Text(text = "Pet name: $newName")
            Text(text = "Pet mood: ${pet.mood}")
            Text(text = "Pet hunger: ${pet.hunger}")
            Text(text = "Pet health: ${pet.health}")
        }
    }
}