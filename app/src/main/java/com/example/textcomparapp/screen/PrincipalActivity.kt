package com.example.textcomparapp.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.textcomparapp.R

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val textComparison = findViewById<Button>(R.id.textComparison)
        textComparison.setOnClickListener {
            navigateToComparApp()
        }
    }

    private fun navigateToComparApp() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}