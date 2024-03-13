package com.example.spaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home_and_History : AppCompatActivity() {

    private lateinit var buttonHome:Button
    private lateinit var buttonHistory:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_and_history)


        buttonHome = findViewById(R.id.homeButton)
        buttonHistory = findViewById(R.id.historyButton)


        buttonHome.setOnClickListener {
            val intent = Intent(this@Home_and_History,Home::class.java)
            startActivity(intent)
        }


        buttonHistory.setOnClickListener {
            val inent = Intent(this@Home_and_History,History::class.java)
            startActivity(intent)
        }
    }
}