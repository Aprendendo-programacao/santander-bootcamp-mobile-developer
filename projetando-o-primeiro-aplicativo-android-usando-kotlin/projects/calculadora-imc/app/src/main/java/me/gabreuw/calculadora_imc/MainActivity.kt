package me.gabreuw.calculadora_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "CREATE (criação da tela)")
        // finish()
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "START (tela visível)")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "RESUME (interação com a tela disponível)")
    }

    override fun onPause() {
        Log.w("lifecycle", "PAUSE (interação com a tela indisponível")
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "STOP (tela invisível, mas ainda existe)")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "RESTART (tela retomada como foco)")
    }

    override fun onDestroy() {
        Log.w("lifecycle", "DESTROY (tela destruída)")
        super.onDestroy()
    }
}