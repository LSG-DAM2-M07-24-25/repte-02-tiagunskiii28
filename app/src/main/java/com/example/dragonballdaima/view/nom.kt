package com.example.dragonballdaima.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dragonballdaima.R
import com.example.dragonballdaima.Routes
import com.example.dragonballdaima.viewModel.viewModel

@Composable
fun nom(myviewModel : viewModel, navController: NavController){
    val iconoAplicacion = painterResource(id = R.drawable.dragonball_daima_logo)
    val scrollState = rememberScrollState()
    var texto = ""
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .verticalScroll(scrollState),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = iconoAplicacion,
                contentDescription = "imagen menu",
                modifier = Modifier
                    .size(300.dp)
                    .padding(30.dp),
                contentScale = ContentScale.Fit
            )
            TextField(
                value = texto,
                onValueChange = { texto = it },
                label = { Text("Nombre")},
                modifier = Modifier
                    .padding(10.dp)
            )
            Button(
                onClick = {
                    myviewModel.elegiNombre(texto)
                    navController.navigate(Routes.resultat.route)
                } ,
                modifier = Modifier.padding(top = 50.dp)
            ){
                Text(text="Entrar")
            }
        }
    }
}