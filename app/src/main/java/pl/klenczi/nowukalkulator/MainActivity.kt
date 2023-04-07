package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pO = findViewById<Button>(R.id.btnPodstawObl)
        val zJ = findViewById<Button>(R.id.btnZamJedn)

        pO.setOnClickListener{
            val intent = Intent(this, PodstawoweObliczenia::class.java)
            startActivity(intent)
        }

        zJ.setOnClickListener{
            val intent = Intent(this, ZamianaJednostek::class.java)
            startActivity(intent)
        }
    }
}