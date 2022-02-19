package com.example.kmm_2.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kmm_2.Greeting
import android.widget.TextView
import android.widget.Toast

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }
}
