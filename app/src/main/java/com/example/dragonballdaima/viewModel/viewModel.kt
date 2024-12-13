package com.example.dragonballdaima.viewModel
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dragonballdaima.Model.dragonBall

class viewModel : ViewModel() {
    private val dragonBall = dragonBall()

    private val _personajeSeleccionado = MutableLiveData(dragonBall.getPersonajeSeleccionado())
    val personajeSeleccionado: MutableLiveData<String> = _personajeSeleccionado
}