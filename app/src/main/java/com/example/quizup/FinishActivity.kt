package com.example.quizup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val correct = intent.getIntExtra("correct", 0)

        val textView = findViewById<TextView>(R.id.textFinish)
        textView.text = correct.toString()
    }
}