package me.gabreuw.calculadora_imc

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        heightET?.doAfterTextChanged { text ->
//            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }

        weightET.doOnTextChanged { text, _, _, _ ->
//            titleTXT.text = text
        }

        calculate_imc_btn.setOnClickListener {
            calculateIMC(weightET.text.toString(), heightET.text.toString())
        }

    }

    private fun calculateIMC(weight: String, height: String) {
        val weight = weight.toFloatOrNull()
        val height = height.toFloatOrNull()

        if (weight != null && height != null) {
            val imc = weight / (height * height)
            titleTXT.text = "Seu IMC é de %.2f".format(imc)
        }
    }
}