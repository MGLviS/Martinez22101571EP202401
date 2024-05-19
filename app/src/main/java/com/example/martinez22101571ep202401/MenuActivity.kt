package com.example.martinez22101571ep202401

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btPrizes: Button = findViewById(R.id.btPrizes)
        val btTeams: Button = findViewById(R.id.btTeams)
        val btStadiums: Button = findViewById(R.id.btStadiums)

        btPrizes.setOnClickListener { goPrizesActivity() }
        btTeams.setOnClickListener { goTeamsActivity() }
        btStadiums.setOnClickListener { goStadiumsActivity() }

    }

    private fun goPrizesActivity() {
        val intent = Intent(this, PrizesActivity::class.java)
        startActivity(intent)
    }
    private fun goTeamsActivity() {
        val intent = Intent(this, TeamsActivity::class.java)
        startActivity(intent)
    }
    private fun goStadiumsActivity() {
        val intent = Intent(this, StadiumActivity::class.java)
        startActivity(intent)
    }
}