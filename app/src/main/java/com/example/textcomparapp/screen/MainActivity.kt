package com.example.textcomparapp.screen

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.textcomparapp.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val btnCompare = findViewById<Button>(R.id.btnCompare)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        btnCompare.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            if (text1 == text2) {
                resultTextView.text = "Los textos son iguales."
            } else {
                resultTextView.text = "Los textos son diferentes."
            }
        }
    }
}