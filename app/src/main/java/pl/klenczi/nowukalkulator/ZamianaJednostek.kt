package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import pl.klenczi.nowukalkulator.databinding.ActivityPodstawoweObliczeniaBinding

class ZamianaJednostek : AppCompatActivity() {
    private lateinit var binding: ActivityPodstawoweObliczeniaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPodstawoweObliczeniaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val back = findViewById<Button>(R.id.btnBackFromZJ)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}