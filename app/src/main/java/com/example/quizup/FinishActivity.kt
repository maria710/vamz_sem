package com.example.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val correct = intent.getIntExtra("correct", 0)

        val textView = findViewById<TextView>(R.id.textFinish)
        textView.text = correct.toString()
    }

    fun goBackToCategories(view: View) {
        val intend = Intent(this, CategoriesActivity::class.java)
        startActivity(intend)
        finish()
    }

    fun exit(view: View) {
        finish()
    }
}