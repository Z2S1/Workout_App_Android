package com.simone.workoutapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.simone.workoutapp.data.model.SeriesEntity
import com.simone.workoutapp.idGenerator
import com.simone.workoutapp.ui.viewmodel.SeriesViewModel

@Composable
fun SeriesItemEditor(
    viewModel: SeriesViewModel,
    deleteClicked: () -> Unit
){
    val categories = listOf<String>("Cardio","Strength")
    var selectedIndex by remember { mutableStateOf(0) }

    var excerciseInput by remember { mutableStateOf("") }
    var repetitionsInput by remember { mutableStateOf("") }
    var weightInput by remember { mutableStateOf("") }
    var durationInput by remember { mutableStateOf("")}

    val deleteInteraction = remember { MutableInteractionSource() }
    val deleteIsPressed by deleteInteraction.collectIsPressedAsState()

    Spacer(Modifier.padding(10.dp))
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
            horizontalArrangement = Arrangement.Center
        ) {

            SingleChoiceSegmentedButtonRow() {
                categories.forEachIndexed { index, label ->
                    SegmentedButton (
                        shape = SegmentedButtonDefaults.itemShape(
                            index = index,
                            count = categories.size
                        ),
                        onClick = { selectedIndex = index },
                        selected = index == selectedIndex,
                        label = { Text(label) }
                    )
                }
            }

        }
        Spacer(Modifier.padding(4.dp))
        Column(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = excerciseInput,
                onValueChange = {excerciseInput = it},
                placeholder = {Text("Excercise")},
                modifier = Modifier.fillMaxWidth(0.95f)
            )
            Spacer(Modifier.padding(4.dp))
            OutlinedTextField(
                value = repetitionsInput,
                onValueChange = {repetitionsInput = it},
                placeholder = {Text("Reps")},
                modifier = Modifier.fillMaxWidth(0.95f)
            )
            Spacer(Modifier.padding(4.dp))
            OutlinedTextField(
                value = weightInput,
                onValueChange = {weightInput = it},
                placeholder = {Text("Weight")},
                modifier = Modifier.fillMaxWidth(0.95f)
            )
            Spacer(Modifier.padding(4.dp))
            OutlinedTextField(
                value = durationInput,
                onValueChange = {durationInput = it},
                placeholder = {Text("Weight")},
                modifier = Modifier.fillMaxWidth(0.95f)
            )
        }
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    viewModel.addSeries(
                        SeriesEntity(
                            id = idGenerator(),
                            date = "2025-12-29",
                            category = categories[selectedIndex],
                            exercise = excerciseInput,
                            repetitions = repetitionsInput.toInt(),
                            weight = weightInput.toFloat(),
                            duration = durationInput.toInt()
                        )
                    )
                }
            ) {
                Text("Add")
            }
            Button(
                onClick = deleteClicked
            ) {
                Text("Delete")
            }
        }

    }
    //Spacer(Modifier.padding(2.dp))
}

