package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PodstawoweObliczenia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podstawowe_obliczenia)

        val back = findViewById<Button>(R.id.btnBackFromPO)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val ac = findViewById<Button>(R.id.btnAC)
        val c = findViewById<Button>(R.id.btnC)
        val procent = findViewById<Button>(R.id.btnProcent)
        val dzielenie = findViewById<Button>(R.id.btnDzielenie)

        val n7 = findViewById<Button>(R.id.btn7)
        val n8 = findViewById<Button>(R.id.btn8)
        val n9 = findViewById<Button>(R.id.btn9)
        val mnozenie = findViewById<Button>(R.id.btnMnozenie)

        val n4 = findViewById<Button>(R.id.btn4)
        val n5 = findViewById<Button>(R.id.btn5)
        val n6 = findViewById<Button>(R.id.btn6)
        val minus = findViewById<Button>(R.id.btnMinus)

        val n1 = findViewById<Button>(R.id.btn1)
        val n2 = findViewById<Button>(R.id.btn2)
        val n3 = findViewById<Button>(R.id.btn3)
        val plus = findViewById<Button>(R.id.btnPlus)

        val n0 = findViewById<Button>(R.id.btn0)
        val rowna = findViewById<Button>(R.id.btnRowna)


    }
}