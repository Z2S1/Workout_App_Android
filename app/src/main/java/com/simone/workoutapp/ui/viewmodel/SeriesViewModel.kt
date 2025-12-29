package com.simone.workoutapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.simone.workoutapp.data.model.SeriesEntity
import com.simone.workoutapp.data.repository.SeriesRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SeriesViewModel(
    private val repository: SeriesRepository
): ViewModel() {
    fun addSeries(series: SeriesEntity){
        viewModelScope.launch{
            repository.insert(series)
        }
    }

    fun deleteSeries(series: SeriesEntity){
        viewModelScope.launch{
            repository.delete(series)
        }
    }

    fun getSeriesByDate(date: String): StateFlow<List<SeriesEntity>>{
        return repository.getByDate(date = date)
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = emptyList()
            )
    }
}