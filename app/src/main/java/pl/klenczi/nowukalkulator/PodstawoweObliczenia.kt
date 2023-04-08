package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import pl.klenczi.nowukalkulator.databinding.ActivityPodstawoweObliczeniaBinding

class PodstawoweObliczenia : AppCompatActivity() {
    private lateinit var binding: ActivityPodstawoweObliczeniaBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityPodstawoweObliczeniaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var pierwszaCzesc = ""
        var drugaCzesc = ""

        val wynik = findViewById<TextView>(R.id.tvWynik)

        val back = findViewById<Button>(R.id.btnBackFromPO)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        fun drugie(){
            
            binding.btn7.setOnClickListener() {
                var data = binding.btn7.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn8.setOnClickListener() {
                var data = binding.btn8.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn9.setOnClickListener() {
                var data = binding.btn9.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn4.setOnClickListener() {
                var data = binding.btn4.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn5.setOnClickListener() {
                var data = binding.btn5.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn6.setOnClickListener() {
                var data = binding.btn6.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn1.setOnClickListener() {
                var data = binding.btn1.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn2.setOnClickListener() {
                var data = binding.btn2.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn3.setOnClickListener() {
                var data = binding.btn3.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
        }

        drugie()

    }
}