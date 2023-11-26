package com.wenpenglee.navigationbar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class page2 : AppCompatActivity() {

    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page2)

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener {
            intent = Intent(this@page2, MainActivity::class.java)
            startActivity(intent)
        }

    }
}

