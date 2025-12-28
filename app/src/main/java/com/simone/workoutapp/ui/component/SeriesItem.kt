package com.simone.workoutapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SeriesItem(){
    Column(
        Modifier
            .fillMaxWidth(0.95f)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(12.dp),
                clip = false
            )
            .background(
                color = Color(0xFF004E98),
                shape = RoundedCornerShape(8.dp))
            .border(
                shape = RoundedCornerShape(8.dp),
                color = Color.Transparent,
                width = (1.dp)
            )
            .padding(4.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Category",
                color = Color(0xFFFF6700))
        }
        Spacer(Modifier.padding(4.dp))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Exercise", color = Color(0xFFEBEBEB))
            Text(text = "Repetitions", color = Color(0xFFEBEBEB))
            Text(text = "Weight", color = Color(0xFFEBEBEB))
        }
    }
    Spacer(Modifier.padding(8.dp))
}