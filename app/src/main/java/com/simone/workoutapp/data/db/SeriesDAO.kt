package com.simone.workoutapp.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.simone.workoutapp.data.model.SeriesEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SeriesDAO {

    @Upsert
    suspend fun insertUpdateSeries(seriesEntity: SeriesEntity)

    @Delete
    suspend fun deleteSeries(seriesEntity: SeriesEntity)

    @Query("SELECT * FROM SeriesEntity")
    fun getAll(): Flow<List<SeriesEntity>>

    // Get data by date
    @Query("SELECT * FROM SeriesEntity WHERE date = :date ORDER BY exercise")
    fun getSeriesByDate(date: String): Flow<List<SeriesEntity>>

    // Get data by exercise
    @Query("SELECT * FROM SeriesEntity WHERE exercise = :exerciseName ORDER BY exercise ")
    fun getSeriesByExercise(exerciseName: String): Flow<List<SeriesEntity>>

    // Get data by category
    @Query("SELECT * FROM SeriesEntity WHERE category = :categoryName ORDER BY exercise ")
    fun getSeriesByCategory(categoryName: String): Flow<List<SeriesEntity>>


}