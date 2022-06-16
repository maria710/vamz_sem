package com.example.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import androidx.appcompat.widget.Toolbar


class CategoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        //val toolbar: Toolbar = findViewById(R.id.toolbar)

        //setSupportActionBar(toolbar)
        //supportActionBar?.title = "Categories"
    }

    fun history(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "history")
        }
        startActivity(intend)
        finish()
    }
}