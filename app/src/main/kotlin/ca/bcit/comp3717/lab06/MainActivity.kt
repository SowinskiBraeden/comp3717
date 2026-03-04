package ca.bcit.comp3717.lab06

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Braeden Sowinski
 * A01385066
 */

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF72849a)),
                verticalArrangement = Arrangement.Center
            ) {
                topRow(
                    Modifier
                        .weight(4f)
                        .padding(vertical = 100.dp),
                )
                middleRow(
                    Modifier
                        .weight(1.3f)
                        .background(Color(0xFF7a55cc))
                        .fillMaxSize(),
                )
                bottomRow(
                    Modifier
                        .weight(3f)
                        .fillMaxSize(),
                )
            }
        }
    }
}