package com.example.martinez22101571ep202401

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TeamsActivity : AppCompatActivity() {

    var arrTeams = arrayOf("Peru", "Brasil", "Argentina", "Colombia",
        "Uruguay", "Chile", "Paraguay", "Ecuador", "Venezuela", "Bolivia")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teams)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val lvTeams: ListView = findViewById(R.id.lvTeams) as ListView
        val btBack: Button = findViewById(R.id.btMenuT)

        val adapter: Any? = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrTeams)
        lvTeams.adapter = adapter as ListAdapter?

        lvTeams.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Posicion: $position ",
                Toast.LENGTH_SHORT
            ).show()
        }

        btBack.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}