package com.example.quizup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class QuestionActivity : AppCompatActivity() {

    var progress: ProgressBar? = null
    var numberOfCorrectAns: Int = 0
    private var listOfQuestion: ArrayList<Question>? = null

    private var ans1: Button? = null
    private var ans2: Button? = null
    private var ans3: Button? = null
    private var ans4: Button? = null

    var question : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        progress = findViewById(R.id.progressBar)

        ans1 = findViewById(R.id.ans1)
        ans2 = findViewById(R.id.ans2)
        ans3 = findViewById(R.id.ans3)
        ans4 = findViewById(R.id.ans4)
        question = findViewById(R.id.question)

        val extra = intent.getStringExtra("questions")

            when(extra) {
                "history" -> listOfQuestion = Questions.getHistoryQuestions()
        }
    }

    fun ans1(view: View) {

        if (listOfQuestion!![progress!!.progress].correctAnswer == 1) {
            numberOfCorrectAns++
        }
        increaseProgress()
        highLightAnswer()
    }

    fun ans2(view: View) {
        if (listOfQuestion!![progress!!.progress].correctAnswer == 2) {
            numberOfCorrectAns++
        }
        increaseProgress()
        highLightAnswer()
    }

    fun ans3(view: View) {
        if (listOfQuestion!![progress!!.progress].correctAnswer == 3) {
            numberOfCorrectAns++
        }
        increaseProgress()
        highLightAnswer()
    }

    fun ans4(view: View) {
        if (listOfQuestion!![progress!!.progress].correctAnswer == 4) {
            numberOfCorrectAns++
        }
        increaseProgress()
        highLightAnswer()
    }

    fun next(view: View) {
        if (progress!!.progress == progress!!.max) {
            //TODO intend
        }
        ans1!!.text = (listOfQuestion!![progress!!.progress].answer1)
        ans2!!.text = (listOfQuestion!![progress!!.progress].answer2)
        ans3!!.text = (listOfQuestion!![progress!!.progress].answer3)
        ans4!!.text = (listOfQuestion!![progress!!.progress].answer4)

    }

    private fun setColorOfButtons(correct: Button, false1: Button, false2: Button, false3: Button) {
        correct.setBackgroundColor(1)
        false1.setBackgroundColor(3)
        false2.setBackgroundColor(3)
        false3.setBackgroundColor(3)
    }

    private fun highLightAnswer() {

        when(listOfQuestion!![progress!!.progress].correctAnswer) {
            1-> setColorOfButtons(ans1!!, ans2!!, ans3!!, ans4!!)
            2-> setColorOfButtons(ans2!!, ans1!!, ans3!!, ans4!!)
            3-> setColorOfButtons(ans3!!, ans1!!, ans2!!, ans4!!)
            4-> setColorOfButtons(ans4!!, ans1!!, ans2!!, ans3!!)
        }
    }

    private fun increaseProgress() {
        progress!!.progress = progress!!.progress + 1
    }

}