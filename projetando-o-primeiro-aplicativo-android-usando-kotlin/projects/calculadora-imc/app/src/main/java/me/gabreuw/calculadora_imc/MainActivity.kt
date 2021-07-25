package me.gabreuw.calculadora_imc

import android.os.Bundle
import android.view.View
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
        calculate_imc_btn.setOnClickListener {
            calculateIMC(weightET.text.toString(), heightET.text.toString())
        }

        back_btn.setOnClickListener { restore() }
    }

    private fun calculateIMC(weight: String, height: String) {
        val weight = weight.toFloatOrNull()
        val height = height.toFloatOrNull()

        if (weight != null && height != null) {
            val imc = weight / (height * height)

            titleTXT.text = "Seu IMC é de %.2f".format(imc)
            heightET.visibility = View.GONE
            weightET.visibility = View.GONE
            imc_rating.visibility = View.VISIBLE
            calculate_imc_btn.visibility = View.GONE
            back_btn.visibility = View.VISIBLE
        }
    }

    private fun restore() {
        imc_rating.visibility = View.GONE
        back_btn.visibility = View.GONE

        titleTXT.text = getString(R.string.app_name)

        weightET.visibility = View.VISIBLE
        weightET.text.clear()
        heightET.visibility = View.VISIBLE
        heightET.text.clear()
        calculate_imc_btn.visibility = View.VISIBLE
    }
}