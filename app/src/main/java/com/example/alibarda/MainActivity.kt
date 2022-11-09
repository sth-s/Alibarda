package com.example.alibarda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var emptyText: TextView
    private lateinit var hi: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emptyText = findViewById(R.id.emptyText)
        hi = findViewById(R.id.hi)
        hi.setOnClickListener {
            emptyText.text = "Hello World!"
        }
    }
}