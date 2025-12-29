package com.simone.workoutapp.data.repository

import com.simone.workoutapp.data.db.SeriesDAO
import com.simone.workoutapp.data.model.SeriesEntity
import kotlinx.coroutines.flow.Flow

class SeriesRepository(
    private val dao: SeriesDAO
){
    suspend fun insert(series: SeriesEntity) {
        dao.insertUpdateSeries(series)
    }

    suspend fun delete(series: SeriesEntity) {
        dao.deleteSeries(series)
    }

    fun getByDate(date: String): Flow<List<SeriesEntity>> {
        return dao.getSeriesByDate(date)
    }

}