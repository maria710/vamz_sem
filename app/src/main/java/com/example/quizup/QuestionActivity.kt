package com.example.quizup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class QuestionActivity : AppCompatActivity() {

    private val progress: ProgressBar = findViewById(R.id.progressBar)
    var numberOfCorrectAns: Int = 0
    private var listOfQuestion: ArrayList<Question> = Questions.getHistoryQuestions()

    val ans1 = findViewById<Button>(R.id.ans1)
    val ans2 = findViewById<Button>(R.id.ans2)
    val ans3 = findViewById<Button>(R.id.ans3)
    val ans4 = findViewById<Button>(R.id.ans4)

    val question = findViewById<TextView>(R.id.question)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val extra = intent.getStringExtra("questions")

        when(extra) {
            "history" -> listOfQuestion = Questions.getHistoryQuestions()
        }
    }


    fun ans1(view: View) {

        if (listOfQuestion[progress.progress].correctAnswer == 1) {
            numberOfCorrectAns++
            ans1.setBackgroundColor(3)
        } else {
            ans1.setBackgroundColor(4)
        }
        progress.progress(progress.progress + 1)

    }

    fun ans2(view: View) {

    }

    fun ans3(view: View) {

    }

    fun ans4(view: View) {

    }

    fun next(view: View) {
        if (progress.progress == progress.max) {

        }


        ans1.setText(listOfQuestion[progress.progress].answer1)
        ans2.setText(listOfQuestion[progress.progress].answer2)
        ans3.setText(listOfQuestion[progress.progress].answer3)
        ans4.setText(listOfQuestion[progress.progress].answer4)

    }

}