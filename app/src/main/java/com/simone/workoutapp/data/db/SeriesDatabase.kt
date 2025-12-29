package com.simone.workoutapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.simone.workoutapp.data.model.SeriesEntity

@Database(
    entities = [SeriesEntity::class],
    version = 1
)
abstract class SeriesDatabase: RoomDatabase() {

    abstract fun dao(): SeriesDAO
}