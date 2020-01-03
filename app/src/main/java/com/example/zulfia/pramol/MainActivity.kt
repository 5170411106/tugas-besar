package com.example.zulfia.pramol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegister: Button = findViewById(R.id.btn_register)

        val btnLogin: Button = findViewById(R.id.btn_login)

        btnRegister.setOnClickListener {
            val registerActivityIntent = Intent(this, RegisterActivity::class.java)

            startActivity(registerActivityIntent)
        }
        btnLogin.setOnClickListener {
            val loginActivityIntent = Intent(this, LoginActivity::class.java)

            startActivity(loginActivityIntent)
        }
    }
}
