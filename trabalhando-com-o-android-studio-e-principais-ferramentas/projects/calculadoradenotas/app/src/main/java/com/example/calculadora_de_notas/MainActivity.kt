package com.example.calculadora_de_notas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcularButton = calcular
        val resultado = resultado

        calcularButton.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) / 2

            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && faltas <= 10) {
                resultado.setText("""
                    Aluno foi aprovado 
                    Nota final: ${media}
                    Faltas: ${faltas}
                """.trimIndent())

                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText("""
                    Aluno foi reprovado 
                    Nota final: ${media}
                    Faltas: ${faltas}
                """.trimIndent())
                resultado.setTextColor(Color.RED)
            }
        }

    }

}