package com.simone.workoutapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SeriesEntity(
    @PrimaryKey val id: String,
    @ColumnInfo val date: String,
    @ColumnInfo val category: String,
    @ColumnInfo val exercise: String,
    @ColumnInfo val repetitions: Int?,
    @ColumnInfo val weight: Float?,
    @ColumnInfo val duration: Int?
)