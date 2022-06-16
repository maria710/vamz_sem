package com.example.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    /**
     * presunutie sa na login
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton = findViewById<Button>(R.id.buttonPlay)

        playButton.setOnClickListener {
            val intend = Intent(this, Login::class.java)
            startActivity(intend)
            finish()
        }
    }
}