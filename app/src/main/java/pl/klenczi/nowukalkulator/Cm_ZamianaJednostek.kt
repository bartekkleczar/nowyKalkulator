package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.*

class Cm_ZamianaJednostek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cm_zamiana_jednostek)

        var input = findViewById<EditText>(R.id.ptInputcm)
        var output = findViewById<TextView>(R.id.tvOutputcm)
        var convert = findViewById<Button>(R.id.btnConvertcm)

        input.inputType = InputType.TYPE_CLASS_NUMBER

        val back = findViewById<Button>(R.id.btnBackFromcmZJ)

        back.setOnClickListener{
            val intent = Intent(this, ZamianaJednostek::class.java)
            startActivity(intent)
        }

        var selectedItemInput = ""
        var selectedItemOutput = ""
        val inputJednostka = findViewById<Spinner>(R.id.spInputcm)
        val outputJednostka = findViewById<Spinner>(R.id.spOutputcm)

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
            val lista = mapOf("mm" to 0.001, "cm" to 0.01, "m" to 1.0, "km" to 1000.0)
            val stabilne = listOf<String>("mm", "cm", "m", "km")
            var result: Double = 0.0

                result = iT * lista[sII]!! / lista[sIO]!!
                output.text = result.toString()
            }



        var ac = findViewById<Button>(R.id.btnACcmZJ)
        ac.setOnClickListener {input.setHint("Podaj wartość"); input.setText(""); output.text = ""}

        convert.setOnClickListener {
            convert()
        }

    }
}