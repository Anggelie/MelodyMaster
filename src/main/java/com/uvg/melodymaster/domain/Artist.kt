package com.uvg.melodymaster.domain.model

data class Artist(
    val name: String,
    val songs: List<Song>,
    val monthlyListeners: Int
)