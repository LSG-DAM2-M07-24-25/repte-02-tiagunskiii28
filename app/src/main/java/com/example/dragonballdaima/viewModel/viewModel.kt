package com.example.dragonballdaima.viewModel
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dragonballdaima.Model.dragonBall

class viewModel : ViewModel() {
    private val dragonBall = dragonBall()

    private val _personajeSeleccionado = MutableLiveData(dragonBall.getPersonajeSeleccionado())
    val personajeSeleccionado: MutableLiveData<String> = _personajeSeleccionado

    private val _nombre = MutableLiveData(dragonBall.getNombre())
    val nombre: MutableLiveData<String> = _nombre

    fun elegirPersonaje(image: String){
        dragonBall.setPersonajeSeleccionado(image)
    }
    fun elegiNombre(nom: String){
        dragonBall.setPersonajeSeleccionado(nom)
    }
    fun update(){
        _personajeSeleccionado.value = dragonBall.getPersonajeSeleccionado()
        _nombre.value = dragonBall.getNombre()
    }
}