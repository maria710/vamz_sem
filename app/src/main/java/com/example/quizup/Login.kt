package com.example.quizup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import org.w3c.dom.Text

class Login : AppCompatActivity() {

    private var nameOfPlayer: AppCompatEditText? = null
        get() {return field }

    /**
     * vytvorenie mena hraca a nasledne presunutie sa do kategorii
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        nameOfPlayer = findViewById<AppCompatEditText>(R.id.nameOfPlayer)


        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {

            if (nameOfPlayer!!.text.toString().isNotEmpty()) {
                val intend = Intent(this, CategoriesActivity::class.java)
                startActivity(intend)
                finish()
            } else {
                Toast.makeText(this, "Enter your name to continue!", Toast.LENGTH_LONG).show()
            }
        }
    }

}