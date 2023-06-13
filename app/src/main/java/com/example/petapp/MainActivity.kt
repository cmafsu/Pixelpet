package com.example.petapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petapp.ui.theme.PETappTheme

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
                       AppHomeScreen()
                }
            }
        }
    }


}

@Composable
fun AppHomeScreen() {
    Column {
        Text(text = "Pet App")
        Button(onClick = { /* TODO: Handle load pet action */ }) {
            Text(text = "Load Pet")
        }
        Button(onClick = { /* TODO: Handle start new pet action */ }) {
            Text(text = "Start New Pet")
        }
        Button(onClick = { /* TODO: Handle access shop action */ }) {
            Text(text = "Access Shop")
        }
    }
}
//fun PetApp(pet: Pet) {
  //  Column {
  //      Text(text = "Pet name: ${pet.getName()}")
 //       Text(text = "Pet mood: ${pet.getMood()}")
 //       Text(text = "Pet hunger: ${pet.getHunger()}")
  //      Text(text = "Pet health: ${pet.getHealth()}")
//    }
//}

@Preview
@Composable
fun PreviewHomeScreen() {
   PETappTheme {
       AppHomeScreen()

   }


}