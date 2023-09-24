package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var e: EditText
    private lateinit var b: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        e = findViewById(R.id.editTextText)
        b = findViewById(R.id.button)
        b.setOnClickListener{
            if (e.text.toString().isBlank())
                e.error="текст"
            else
                b.text=e.text.toString()
        }
        val cl= View.OnClickListener {
            val s="${e.text.toString()}${(it as Button).text}"
            e.setText(s)
        }
        val b1: Button=findViewById(R.id.b1)
        val b2: Button=findViewById(R.id.b2)
        val b3: Button=findViewById(R.id.b3)
        b1.setOnClickListener(cl)
        b2.setOnClickListener(cl)
        b3.setOnClickListener(cl)
    }

}