package com.luany.gasolinaalcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View) {

        val editAlcool = findViewById<EditText>(R.id.edit_alcool)
        val editGasolina = findViewById<EditText>(R.id.edit_gasolina)
        val textResultado = findViewById<TextView>(R.id.text_resultado)

        val precoAlcool = editAlcool.text.toString()
        val precoGasolina = editGasolina.text.toString()

        if (precoAlcool.isNotEmpty()) {

            if (precoGasolina.isNotEmpty()) {

                //deu tudo certo
                /* fazer cálculo de menor preço
                 * Se (valorAlcool / valorGasolina) >= 0.7 é melhor utilizar gasolina que é 70% do preço
                 * se não, é melhor utilizar álcool
                 */

                val pAlcool = precoAlcool.toDouble()
                val pGasolina = precoGasolina.toDouble()

                val resultado = pAlcool / pGasolina
                if (resultado >= 0.7) {
                    textResultado.text = "Melhor utilizar gasolina"
                } else {//Álcool
                    textResultado.text = "Melhor utilizar álcool"

                }
            }
        }
    }
}