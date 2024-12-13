package com.example.dragonballdaima

sealed class Routes(val route: String) {
    object launchScreen : Routes("launchScreen")
    object personatge : Routes("personatge")
    object nom : Routes("nom")
    object resultat : Routes("resultat")
}