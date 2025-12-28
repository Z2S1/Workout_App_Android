package com.simone.workoutapp.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.simone.workoutapp.ui.component.AdderButtons
import com.simone.workoutapp.ui.component.SeriesItem
import com.simone.workoutapp.ui.component.SummaryCard
import com.simone.workoutapp.ui.component.WorkOut

@Composable
fun DailyWorkoutScreen(){
    val backgroundColor: Color = Color(0xFF3a6ea5)
    Column(
        Modifier
            .background(
                color = backgroundColor
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SummaryCard()
        AdderButtons()
        WorkOut()
    }

}