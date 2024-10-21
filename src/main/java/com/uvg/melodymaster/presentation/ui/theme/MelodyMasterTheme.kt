package com.uvg.melodymaster.presentation.ui.theme

//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable

private val DarkColorPalette = lazy()

fun lazy(): Any {
    TODO("Not yet implemented")
}

private val LightColorPalette = lightColors()

fun lightColors(): Any {
        TODO("Not yet implemented")
}

object Purple700

object Teal200

@Composable
fun MelodyMasterTheme(
    darkTheme: Boolean = isSystemInDarkTheme()
) {
    if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme1()
}

class MaterialTheme1
