package me.gabreuw.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var contador: Int = 0

    var mContador = MutableLiveData<String>().apply { value = contador.toString() }

    private fun setmContador() {
        mContador.value = contador.toString()
    }

    private fun validaContador() {
        contador++

        if (contador > 5) {
            contador = 0
        }

        setmContador()
    }

    fun contador() {
        validaContador()
    }

}