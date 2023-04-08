package pl.klenczi.nowukalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import pl.klenczi.nowukalkulator.databinding.ActivityPodstawoweObliczeniaBinding
import java.util.*

class PodstawoweObliczenia : AppCompatActivity() {
    private lateinit var binding: ActivityPodstawoweObliczeniaBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityPodstawoweObliczeniaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun zmianaJezyka(jezyk: String = "pl"){
            val lang = jezyk
            val locale = Locale(lang)
            Locale.setDefault(locale)

            val config = baseContext.resources.configuration
            config.setLocale(locale)
            baseContext.createConfigurationContext(config)
        }

        var pierwszaCzesc = ""
        var drugaCzesc = ""
        var dzialanie = ""

        val back = findViewById<Button>(R.id.btnBackFromPO)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        fun drugie(){
            var assist: String =  "$pierwszaCzesc $dzialanie "
            binding.btn7.setOnClickListener {
                val data = binding.btn7.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn8.setOnClickListener {
                val data = binding.btn8.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn9.setOnClickListener {
                val data = binding.btn9.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn4.setOnClickListener {
                val data = binding.btn4.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn5.setOnClickListener {
                val data = binding.btn5.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn6.setOnClickListener {
                val data = binding.btn6.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn1.setOnClickListener {
                val data = binding.btn1.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn2.setOnClickListener {
                val data = binding.btn2.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn3.setOnClickListener {
                val data = binding.btn3.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }
            binding.btn0.setOnClickListener {
                val data = binding.btn0.text
                drugaCzesc += data
                binding.tvWynik.text = assist + drugaCzesc
            }

            binding.btnC.setOnClickListener {
                if(drugaCzesc.isNotEmpty()){
                    val data = drugaCzesc.substring(0, drugaCzesc.length - 1)
                    drugaCzesc = data
                    binding.tvWynik.text = assist + drugaCzesc
                }
                else{Toast.makeText(this, "Nie można usunąć niczego", Toast.LENGTH_SHORT).show()}
            }

            binding.btnRowna.setOnClickListener{
                zmianaJezyka("US")
                var suma = 0.0
                var assist: String // zmienna do pomocy w kodzie/żeby burdelu nie było
                when(dzialanie){
                    binding.btnPlus.text.toString() -> {suma = pierwszaCzesc.toDouble() + drugaCzesc.toDouble()}
                    binding.btnMinus.text.toString() -> {suma = pierwszaCzesc.toDouble() - drugaCzesc.toDouble()}
                    binding.btnDzielenie.text.toString() -> {suma = pierwszaCzesc.toDouble() / drugaCzesc.toDouble()}
                    binding.btnMnozenie.text.toString() -> {suma = pierwszaCzesc.toDouble() * drugaCzesc.toDouble()}
                    binding.btnProcent.text.toString() -> {assist = (pierwszaCzesc.toDouble() / 100.0).toString(); suma = assist.toDouble() * drugaCzesc.toDouble()}
                }
                suma = String.format("%.2f", suma).toDouble()

                binding.tvWynik.text = "$pierwszaCzesc $dzialanie $drugaCzesc ${binding.btnRowna.text} $suma"

                zmianaJezyka()
            }
        }

        fun pierwsze(){
            binding.btn7.setOnClickListener {
                val data = binding.btn7.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }
            binding.btn8.setOnClickListener {
                val data = binding.btn8.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }
            binding.btn9.setOnClickListener {
                val data = binding.btn9.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }
            binding.btn4.setOnClickListener {
                val data = binding.btn4.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }
            binding.btn5.setOnClickListener {
                val data = binding.btn5.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }
            binding.btn6.setOnClickListener {
                val data = binding.btn6.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }
            binding.btn1.setOnClickListener {
                val data = binding.btn1.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }
            binding.btn2.setOnClickListener {
                val data = binding.btn2.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }
            binding.btn3.setOnClickListener {
                val data = binding.btn3.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }

            binding.btn0.setOnClickListener {
                val data = binding.btn0.text
                pierwszaCzesc += data
                binding.tvWynik.text = pierwszaCzesc
            }

            binding.btnC.setOnClickListener {
                if(pierwszaCzesc.isNotEmpty()){
                    val data = pierwszaCzesc.substring(0, pierwszaCzesc.length - 1)
                    pierwszaCzesc = data
                    binding.tvWynik.text = pierwszaCzesc
                }
                else{Toast.makeText(this, "Nie można usunąć niczego", Toast.LENGTH_SHORT).show()}
            }

            binding.btnPlus.setOnClickListener{
                dzialanie = binding.btnPlus.text.toString()
                binding.tvWynik.text = "$pierwszaCzesc $dzialanie "
                drugie()
            }
            binding.btnMinus.setOnClickListener{
                dzialanie = binding.btnMinus.text.toString()
                binding.tvWynik.text = "$pierwszaCzesc $dzialanie "
                drugie()
            }
            binding.btnDzielenie.setOnClickListener{
                dzialanie = binding.btnDzielenie.text.toString()
                binding.tvWynik.text = "$pierwszaCzesc $dzialanie "
                drugie()
            }
            binding.btnMnozenie.setOnClickListener{
                dzialanie = binding.btnMnozenie.text.toString()
                binding.tvWynik.text = "$pierwszaCzesc $dzialanie "
                drugie()
            }
            binding.btnProcent.setOnClickListener{
                dzialanie = binding.btnProcent.text.toString()
                binding.tvWynik.text = "$pierwszaCzesc $dzialanie "
                drugie()
            }
            
        }

        binding.btnAC.setOnClickListener{
            pierwszaCzesc = ""
            dzialanie = ""
            drugaCzesc = ""
            binding.tvWynik.text = ""
            pierwsze()
        }

        pierwsze()

    }
}