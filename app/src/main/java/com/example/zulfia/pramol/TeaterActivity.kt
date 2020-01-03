package com.example.zulfia.pramol

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TeaterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teater)

        val btnbuy: Button = findViewById(R.id.buy)
        val btncancel: Button = findViewById(R.id.cancel)
        val scoreTeamA :Int = 0

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