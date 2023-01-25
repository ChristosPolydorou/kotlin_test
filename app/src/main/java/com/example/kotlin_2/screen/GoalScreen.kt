package com.example.kotlin_2.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.kotlin_2.R

@Composable
fun GoalScreen(){
    Column (Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(50.dp))
        Text(text = "Goal Screen")
        Spacer(Modifier.height(50.dp))
        OutlinedButton(
            modifier = Modifier
                .background(Color.Transparent),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_200)),
            onClick = {

            }
        ) {
            Text("1st Level: 250 Steps", color = Color.White)
        }
        Spacer(Modifier.height(50.dp))
        OutlinedButton(
            modifier = Modifier
                .background(Color.Transparent),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_200)),
            onClick = {

            }
        ) {
            Text("2nd Level: 500 Steps", color = Color.White)
        }
        Spacer(Modifier.height(50.dp))
        OutlinedButton(
            modifier = Modifier
                .background(Color.Transparent),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_200)),
            onClick = {

            }
        ) {
            Text("3rd Level: 1000 Steps", color = Color.White)
        }
        Spacer(Modifier.height(50.dp))
        OutlinedButton(
            modifier = Modifier
                .background(Color.Transparent),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_200)),
            onClick = {

            }
        ) {
            Text("4th Level: 2500 Steps", color = Color.White)
        }
        Spacer(Modifier.height(50.dp))
        OutlinedButton(
            modifier = Modifier
                .background(Color.Transparent),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.teal_200)),
            onClick = {

            }
        ) {
            Text("5th Level: 5000 Steps", color = Color.White)
        }
    }
}