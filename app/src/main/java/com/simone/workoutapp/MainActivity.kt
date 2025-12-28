package com.simone.workoutapp

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.simone.workoutapp.ui.theme.WorkoutAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WorkoutAppTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize(),
                    containerColor = Color(0xFF3a6ea5),
                )
                { innerPadding ->
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Summary()
                        WorkOut()
                    }
                }
            }
        }
    }
}

@Composable
fun Summary() {
    Spacer(Modifier.padding(8.dp))
    val colorTitles : Color = Color(0xFFFF6700)
    val colorValues : Color = Color(0xFFEBEBEB)
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

@Composable
fun WorkOut(){
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.padding(10.dp))
        Adder()
        Spacer(Modifier.padding(10.dp))
        SeriesItem()
        SeriesItem()
        SeriesItem()
        SeriesItem()
    }
}

//Per singola serie
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

@Composable
fun Adder(){
    Row() {
        Row(
            Modifier
                .width(100.dp)
                .background(
                    color = Color(0xFFC0C0C0),
                    shape = RoundedCornerShape(4.dp)
                )
                .padding(1.dp)
                .border(
                    width = 1.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(4.dp)
                ),
                horizontalArrangement = Arrangement.Center
        ){
            Text("Excercise")
        }
        Spacer(Modifier.padding(16.dp))
        Row(
            Modifier
                .width(100.dp)
                .background(
                    color = Color(0xFFC0C0C0),
                    shape = RoundedCornerShape(4.dp)
                )
                .padding(1.dp)
                .border(
                    width = 1.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(4.dp)
                ),
            horizontalArrangement = Arrangement.Center


        ){
            Text("Text")
        }
    }

}


@Preview(showBackground = true)
@Composable
fun SeriesItemPreview(){
    SeriesItem()
}

@Preview(showBackground = true)
@Composable
fun AdderPreview(){
    Adder()
}