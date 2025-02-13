package com.uvg.melodymaster.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.uvg.melodymaster.data.local.entity.SongEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SongDao {
    @Query("SELECT * FROM SongEntity")
    fun getAllSongs() : Flow<List<SongEntity>>

    @Insert
    suspend fun insertAll(songs: List<SongEntity>)

    @Query("UPDATE SongEntity SET isFavorite = :isFav WHERE id = :id")
    suspend fun updateFavorite(id: Int, isFav: Boolean)

    @Query("SELECT * FROM SongEntity WHERE artistId = :artistId")
    suspend fun getSongsFromArtist(artistId: String): List<SongEntity>
}