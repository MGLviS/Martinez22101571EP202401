package com.example.martinez22101571ep202401

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class PrizesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prizes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etPremio: EditText = findViewById(R.id.etPremio)
        val btCalc: Button = findViewById(R.id.btPremioCalc)
        val tvResult: TextView = findViewById(R.id.tvPremioResult)
        val btnBack: Button = findViewById(R.id.btMenuP)

        btCalc.setOnClickListener {
            if(etPremio.text.isEmpty()){
                tvResult.text = "Ingresa un valor"
            } else{
                val premio = etPremio.text.toString().toDouble()
                val primerLugar = (premio * 0.25).roundToInt()
                val segundoLugar = (premio * 0.15).roundToInt()
                val tercerLugar = (premio * 0.10).roundToInt()
                val resto = ((premio - (primerLugar + segundoLugar + tercerLugar)) / 13).roundToInt()
                tvResult.text = "1st place: $primerLugar\n USD" +
                                "2nd place: $segundoLugar\n USD" +
                                "3rd place: $tercerLugar\n USD" +
                                "4th - 16th Place: $resto USD"
            }
        }
        btnBack.setOnClickListener { goMenuActivity() }
    }

    private fun goMenuActivity() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }
}