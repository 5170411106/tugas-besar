package com.example.zulfia.pramol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_submit.setOnClickListener {
            Toast.makeText(this, """
                Name  : ${input_name.text}
                Email : ${input_email.text}
                Password : ${input_password.text}
            """.trimIndent(), Toast.LENGTH_SHORT).show()
        }

    }
}
