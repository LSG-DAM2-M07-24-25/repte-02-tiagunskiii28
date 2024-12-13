package com.example.dragonballdaima.Model

data class dragonBall(
    var personages: List<String> = listOf(
        "Gomah", "Goku", "Vegeta", "Piccolo", "Supreme", "Masked Majin", "Unselected"
    ),
    var nom: String = "Pablo"
){
    private var personajeSeleccionado: String = "defecto"

    fun getPersonajeSeleccionado(): String = personajeSeleccionado
}
