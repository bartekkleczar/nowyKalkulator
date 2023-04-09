package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ZamianaJednostek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zamiana_jednostek)

        val back = findViewById<Button>(R.id.btnBackFromCmZJ)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val kg = findViewById<FloatingActionButton>(R.id.fabKG)
        val cm = findViewById<FloatingActionButton>(R.id.fabCm)

        kg.setOnClickListener{
            val intent = Intent(this, Kg_ZamianaJednostek::class.java)
            startActivity(intent)
        }

        cm.setOnClickListener{
            val intent = Intent(this, Cm_ZamianaJednostek::class.java)
            startActivity(intent)
        }
    }
}