package com.simone.workoutapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
fun SummaryCard() {
    val colorTitles : Color = Color(0xFFFF6700)
    val colorValues : Color = Color(0xFFEBEBEB)

    Spacer(Modifier.padding(8.dp))
    // Card
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
                color = colorValues,
                width=(1.dp),
                shape = RoundedCornerShape(8.dp))
            .padding(4.dp),
        ) {
        Row(){
            Text("N. Excercises", color= colorTitles)
            Text("8", color= colorValues)
        }
        Row(){
            Text("N. Series", color= colorTitles)
            Text("20", color= colorValues)
        }
        Row(){
            Text("Time Cardio:", color= colorTitles)
            Text("30:00", color= colorValues)
        }
    }
}