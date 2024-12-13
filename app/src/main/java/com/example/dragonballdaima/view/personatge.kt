package com.example.dragonballdaima.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dragonballdaima.R
import com.example.dragonballdaima.Routes
import com.example.dragonballdaima.viewModel.viewModel

@Composable
fun personatge(myviewModel : viewModel, navController: NavController){
    val iconoAplicacion = painterResource(id = R.drawable.dragonball_daima_logo)
    val scrollState = rememberScrollState()
    val personajeSeleccionado by myviewModel.personajeSeleccionado.observeAsState()
    val keys = listOf(
        listOf(R.drawable.gomah, R.drawable.goku, R.drawable.vegeta),
        listOf(R.drawable.piccolo, R.drawable.supreme, R.drawable.masked_majin),
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = iconoAplicacion,
                contentDescription = "imagen menu",
                modifier = Modifier
                    .size(300.dp)
                    .padding(30.dp),
                contentScale = ContentScale.Fit
            )
            keys.forEach { row ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    row.forEach { key ->
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = key),
                                contentDescription = "Imagen"
                            )
                        }
                    }
                }
            }
            Button(
                onClick = {
                    navController.navigate(Routes.nom.route)
                } ,
                modifier = Modifier.padding(top = 50.dp)
            ){
                Text(text="Continuar")
            }

        }
    }

}