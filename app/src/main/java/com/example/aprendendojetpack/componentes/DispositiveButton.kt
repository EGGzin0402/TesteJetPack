package com.example.aprendendojetpack.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aprendendojetpack.ui.theme.*

@Composable
fun DispositiveButton(){

    Button(

        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        modifier = Modifier
            .size(width = 390.dp, height = 150.dp)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Purple200,
                        Purple500,
                        Purple700,

                    )
                ),
                shape = ShapeButton.medium,
            ),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            hoveredElevation = 0.dp
        ),
        onClick = {

    }) {

        Text(text = "Dispositivo 1", fontSize = 48.sp, color = Color.White, )

    }

}

@Composable
@Preview
private fun DispositiveButtonPreview(){

    DispositiveButton()

}