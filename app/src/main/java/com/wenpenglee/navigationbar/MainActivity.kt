package com.wenpenglee.navigationbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.wenpenglee.navigationbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigation.selectedItemId = R.id.page_1

        val Name: TextView
        Name = findViewById(R.id.textView)
        val bundle = intent.extras
        Name.setText(bundle?.getString("name"))

        binding.bottomNavigation.setOnItemSelectedListener {item ->
            when(item.itemId) {
                R.id.page_1 -> {
                    changeTitle(item.title.toString())
                    true


                }
                R.id.page_2 -> {
                    Intent(this@MainActivity, page2::class.java)
                    startActivity(intent)
                    true

                }
                R.id.page_3 -> {
                    showSnackBar()
                    changeTitle(item.title.toString())
                    true
                }
                R.id.page_4 -> {
                    showSnackBar()
                    changeTitle(item.title.toString())
                    true
                }
                else -> false
            }

        }
    }
    private fun showSnackBar() {
        val contextView = findViewById<View>(R.id.bottom_navigation)
        Snackbar.make(contextView, R.string.unavailable, Snackbar.LENGTH_SHORT)
            .show()
    }
    private fun changeTitle(title: String) {
        binding.textView.text = title

    }
}