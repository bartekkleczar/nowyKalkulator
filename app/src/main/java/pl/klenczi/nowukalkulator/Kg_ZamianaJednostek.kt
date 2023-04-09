package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class Kg_ZamianaJednostek : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kg_zamiana_jednostek)

        var input = findViewById<EditText>(R.id.ptInput)
        var output = findViewById<TextView>(R.id.tvOutput)
        var convert = findViewById<Button>(R.id.btnConvert)

        val back = findViewById<Button>(R.id.btnBackFromCmZJ)

        back.setOnClickListener{
            val intent = Intent(this, ZamianaJednostek::class.java)
            startActivity(intent)
        }

        var selectedItemInput = ""
        var selectedItemOutput = ""
        val inputJednostka = findViewById<Spinner>(R.id.spInput)
        val outputJednostka = findViewById<Spinner>(R.id.spOutput)

        inputJednostka.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                selectedItemInput = parent.getItemAtPosition(position).toString()
                convert
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Kod wykonywany, gdy nie wybrano żadnego elementu spinnera.
            }
        }

        outputJednostka.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                selectedItemOutput = parent.getItemAtPosition(position).toString()
                convert
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Kod wykonywany, gdy nie wybrano żadnego elementu spinnera.
            }
        }

        fun convert(sII: String = selectedItemInput, sIO: String = selectedItemOutput) {
            val iT = input.text.toString().toDoubleOrNull() ?: 0.0
            val lista = mapOf("mg" to 0.001, "g" to 1.0, "dag" to 10.0, "kg" to 1000.0, "t" to 1000000.0, "lb" to 453.592, "oz" to 28.3495)

            val result = iT * lista[sII]!! / lista[sIO]!!

            output.text = result.toString()
        }

        var ac = findViewById<Button>(R.id.btnACkgZJ)
        ac.setOnClickListener {input.setHint("Podaj wartość"); input.setText(""); output.text = ""}

        convert.setOnClickListener {
            convert()
        }
    }
}