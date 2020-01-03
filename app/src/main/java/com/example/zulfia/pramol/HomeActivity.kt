package com.example.zulfia.pramol
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnview: TextView = findViewById(R.id.tulisancandi)
        val btntampil: TextView = findViewById(R.id.tulisanteater)

        btnview.setOnClickListener {
            val candiActivityIntent = Intent(this, CandiActivity::class.java)

            startActivity(candiActivityIntent)
        }


        btntampil.setOnClickListener {
            val teaterActivityIntent = Intent(this, TeaterActivity::class.java)

            startActivity(teaterActivityIntent)
        }

    }
}
