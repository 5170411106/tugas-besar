package com.example.zulfia.pramol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CandiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candi)
 
        val btnbuy: Button = findViewById(R.id.buy)
        val btncancel : Button = findViewById(R.id.cancel)

        btnbuy.setOnClickListener {
            val tiketActivityIntent = Intent(this, tiketActivity::class.java)

            startActivity(tiketActivityIntent)
        }

        btncancel.setOnClickListener {
            val HomeActivityIntent = Intent(this, HomeActivity::class.java)

            startActivity(HomeActivityIntent)
        }

    }
}
