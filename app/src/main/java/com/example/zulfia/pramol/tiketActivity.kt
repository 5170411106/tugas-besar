package com.example.zulfia.pramol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class tiketActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiket)

        val btnoke: Button = findViewById(R.id.btn_ok)

        btnoke.setOnClickListener {
            val HomeActivityIntent = Intent(this, HomeActivity::class.java)

            startActivity(HomeActivityIntent)
        }

    }
}
