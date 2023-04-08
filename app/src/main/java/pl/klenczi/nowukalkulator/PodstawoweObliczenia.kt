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
        var dzialanie = ""
        

        val back = findViewById<Button>(R.id.btnBackFromPO)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        fun drugie(){
            binding.btn7.setOnClickListener() {
                val data = binding.btn7.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn8.setOnClickListener() {
                val data = binding.btn8.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn9.setOnClickListener() {
                val data = binding.btn9.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn4.setOnClickListener() {
                val data = binding.btn4.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn5.setOnClickListener() {
                val data = binding.btn5.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn6.setOnClickListener() {
                val data = binding.btn6.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn1.setOnClickListener() {
                val data = binding.btn1.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn2.setOnClickListener() {
                val data = binding.btn2.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
            binding.btn3.setOnClickListener() {
                val data = binding.btn3.text
                drugaCzesc += data
                binding.tvWynik.text = drugaCzesc.toString()
            }
        }

        fun pierwsze(){
            binding.btn7.setOnClickListener() {
                val data = binding.btn7.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
            binding.btn8.setOnClickListener() {
                val data = binding.btn8.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
            binding.btn9.setOnClickListener() {
                val data = binding.btn9.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
            binding.btn4.setOnClickListener() {
                val data = binding.btn4.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
            binding.btn5.setOnClickListener() {
                val data = binding.btn5.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
            binding.btn6.setOnClickListener() {
                val data = binding.btn6.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
            binding.btn1.setOnClickListener() {
                val data = binding.btn1.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
            binding.btn2.setOnClickListener() {
                val data = binding.btn2.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
            binding.btn3.setOnClickListener() {
                val data = binding.btn3.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc.toString()
            }
        }

        fun operator(){
            binding.btnPlus.setOnClickListener{}
                dzialanie = ""
        }

        drugie()

    }
}