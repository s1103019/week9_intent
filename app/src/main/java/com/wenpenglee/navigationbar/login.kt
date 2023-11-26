package com.wenpenglee.navigationbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login : AppCompatActivity() {
    lateinit var name: EditText

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        name = findViewById(R.id.Name)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val strName = name.text.toString()


            intent = Intent(this@login, MainActivity::class.java)
            val bundle = Bundle().apply {
                putString("name", strName)
            }
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}