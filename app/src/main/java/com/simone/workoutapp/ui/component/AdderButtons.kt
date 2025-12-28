package com.simone.workoutapp.ui.component

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.*

@Composable
fun AdderButtons(){
    val colorBackground: Color = Color(0xFFC0C0C0)
    //For the excercise button
    val excerciseInteraction = remember { MutableInteractionSource() }
    val excerciseIsPressed by excerciseInteraction.collectIsPressedAsState()
    //For the text button
    val textInteraction = remember { MutableInteractionSource() }
    val textIsPressed by textInteraction.collectIsPressedAsState()

    Row(
        Modifier.padding(
            top = 8.dp
        )
    ) {
        Button(
            onClick = {},
            interactionSource = excerciseInteraction,
            colors = ButtonDefaults.buttonColors(
                if (excerciseIsPressed) Color.DarkGray else Color(0xFFC0C0C0))
        ) {
            Text("Exercise")
        }
        Spacer(Modifier.padding(16.dp))
        Button(
            onClick = {},
            interactionSource = textInteraction,
            colors = ButtonDefaults.buttonColors(
                if (textIsPressed) Color.DarkGray else Color(0xFFC0C0C0))
        ) {
            Text("Text")
        }

    }

}