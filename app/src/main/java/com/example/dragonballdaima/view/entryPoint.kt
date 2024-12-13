package com.example.dragonballdaima

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dragonballdaima.viewModel.viewModel
import com.example.dragonballdaima.view.*

@Composable
fun entryPoint(navigationController: NavController){
    val myViewModel: viewModel = viewModel() //tt
    NavHost(
        navController = navigationController as NavHostController,
        startDestination = Routes.launchScreen.route
    ){
        composable(Routes.launchScreen.route) { launchScreen(myViewModel, navigationController)}
        composable(Routes.personatge.route){ personatge(myViewModel, navigationController) }
        composable(Routes.nom.route){ nom(myViewModel, navigationController)}
        composable(Routes.resultat.route){ resultat(myViewModel, navigationController)}
    }
}//aa