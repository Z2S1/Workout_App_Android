package com.simone.workoutapp.data.db

import android.content.Context
import androidx.room.Room

object SeriesDatabaseProvider {

    @Volatile
    private var INSTANCE: SeriesDatabase? = null

    fun getDatabase(context: Context): SeriesDatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                SeriesDatabase::class.java,
                "series_db"
            ).build()
            INSTANCE = instance
            instance
        }
    }
}