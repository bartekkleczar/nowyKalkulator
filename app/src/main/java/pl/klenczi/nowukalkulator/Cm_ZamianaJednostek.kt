package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cm_ZamianaJednostek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cm_zamiana_jednostek)
        val back = findViewById<Button>(R.id.btnBackFromCmZJ)

        back.setOnClickListener{
            val intent = Intent(this, ZamianaJednostek::class.java)
            startActivity(intent)
        }

    }
}