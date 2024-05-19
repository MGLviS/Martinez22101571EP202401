package com.example.martinez22101571ep202401

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.martinez22101571ep202401.Adapter.StadiumAdapter
import com.example.martinez22101571ep202401.Model.StadiumModel

class StadiumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stadium)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val StadiumAdapter = StadiumAdapter(this.lstStadium())

        val recyclerView: RecyclerView = findViewById(R.id.rvStadium)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = StadiumAdapter

        val btnBack: Button = findViewById(R.id.btMenuS)
        btnBack.setOnClickListener { goMenuActivity() }

    }

    private fun goMenuActivity() {
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
    }

    private fun lstStadium(): List<StadiumModel>{
        val lstStadium: ArrayList<StadiumModel> = ArrayList()

        lstStadium.add(
            StadiumModel(
                "Estadio 01",
                R.drawable.stadio1,
                "USA 1",
                "10000"
            )
        )

        lstStadium.add(
            StadiumModel(
                "Estadio 02",
                R.drawable.stadio1,
                "USA 2",
                "20000"
            )
        )

        lstStadium.add(
            StadiumModel(
                "Estadio 03",
                R.drawable.stadio1,
                "USA 3",
                "30000"
            )
        )

        return lstStadium
    }
}