package com.example.midtermproject.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.midtermproject.data.HighScore

@Dao
interface HighScoreDao {
    @Insert
    suspend fun insert(highScore: HighScore)
    @Query("SELECT * FROM high_scores ORDER BY score DESC")
    fun getAllHighScores(): LiveData<List<HighScore>>

    @Delete
    suspend fun delete(highScore: HighScore)
}