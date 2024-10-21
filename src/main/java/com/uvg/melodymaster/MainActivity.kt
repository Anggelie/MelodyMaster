package com.uvg.melodymaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MelodyMasterTheme()
        }
    }

    private fun MelodyMasterTheme() {
        TODO("Not yet implemented")
    }
}

@Composable
fun ExploreScreen() {
    TODO("Not yet implemented")
}

@Composable
fun ArtistsScreen() {
    TODO("Not yet implemented")
}

fun BottomNavigationItem(

    selected: Boolean,
    onClick: () -> Unit
) {
    TODO("Not yet implemented")
}

@Composable
fun BottomNavigation(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
