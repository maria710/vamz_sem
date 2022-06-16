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
    }

    /**
     * vytvaranie aktivity pre kategoriu history
     */
    fun history(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "history")
        }
        startActivity(intend)
        finish()
    }

    /**
     * vytvaranie aktivity pre kategoriu technology
     */
    fun technology(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "technology")
        }
        startActivity(intend)
        finish()
    }

    /**
     * vytvaranie aktivity pre kategoriu nature
     */
    fun nature(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "nature")
        }
        startActivity(intend)
        finish()
    }

    /**
     * vytvaranie aktivity pre kategoriu films
     */
    fun films(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "films")
        }
        startActivity(intend)
        finish()
    }

    /**
     * vytvaranie aktivity pre kategoriu androids
     */
    fun androids(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "androids")
        }
        startActivity(intend)
        finish()
    }

    /**
     * vytvaranie aktivity pre kategoriu animals
     */
    fun animals(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "animals")
        }
        startActivity(intend)
        finish()
    }

    /**
     * vytvaranie aktivity pre kategoriu humanBody
     */
    fun humanBody(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "humanBody")
        }
        startActivity(intend)
        finish()
    }

    /**
     * vytvaranie aktivity pre kategoriu geography
     */
    fun geography(view: View) {
        val intend = Intent(this, QuestionActivity::class.java).apply {
            putExtra("questions", "geography")
        }
        startActivity(intend)
        finish()
    }
}