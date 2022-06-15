package com.example.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var startButton: Button? = null
    private var playButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById<Button>(R.id.buttonPlay)


        playButton?.setOnClickListener {
            setContentView(R.layout.activity_login)
        }

        startButton = findViewById(R.id.startButton)

    }
}