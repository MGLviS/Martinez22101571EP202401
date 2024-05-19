package com.example.martinez22101571ep202401

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etUsuario: EditText = findViewById(R.id.etUsuario)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btLogin: Button = findViewById(R.id.btLogin)

        btLogin.setOnClickListener {
            if(etUsuario.text.isEmpty() || etPassword.text.isEmpty()){
                Toast.makeText(this,"Ingresa tu usuario y contraseña",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            } else{
                if(etUsuario.text.toString() == "admin@americancup.com" && etPassword.text.toString() == "admin123"){
                    val intent = Intent(this, MenuActivity::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this,"Usuario o contraseña incorrectos",Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}