package com.example.zulfia.pramol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.btn_login)

        btnLogin.setOnClickListener {
            val homeActivityIntent = Intent(this, HomeActivity::class.java)

            startActivity(homeActivityIntent)
        }
    }
}
