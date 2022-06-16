package com.example.quizup

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class QuestionActivity : AppCompatActivity() {

    private var progress: ProgressBar? = null
    private var numberOfCorrectAns: Int = 0
    private var numberOfActualAns: Int = 0
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

        progress!!.max = listOfQuestion!!.size
    }

    fun ans1(view: View) {

        if (listOfQuestion!![numberOfActualAns].correctAnswer == 1) {
            numberOfCorrectAns++
        }
        highLightAnswer()
    }

    fun ans2(view: View) {
        if (listOfQuestion!![numberOfActualAns].correctAnswer == 2) {
            numberOfCorrectAns++
        }
        highLightAnswer()
    }

    fun ans3(view: View) {
        if (listOfQuestion!![numberOfActualAns].correctAnswer == 3) {
            numberOfCorrectAns++
        }
        highLightAnswer()
    }

    fun ans4(view: View) {
        if (listOfQuestion!![numberOfActualAns].correctAnswer == 4) {
            numberOfCorrectAns++
        }
        highLightAnswer()
    }

    fun next(view: View) {
        numberOfActualAns++
        progress!!.progress = numberOfActualAns

        if (numberOfActualAns == listOfQuestion!!.size) {
            val intend = Intent(this, FinishActivity::class.java).apply {
                putExtra("correct", numberOfCorrectAns)
            }
            startActivity(intend)
            finish()
        }

        ans1!!.text = (listOfQuestion!![numberOfActualAns].answer1)
        ans2!!.text = (listOfQuestion!![numberOfActualAns].answer2)
        ans3!!.text = (listOfQuestion!![numberOfActualAns].answer3)
        ans4!!.text = (listOfQuestion!![numberOfActualAns].answer4)

        question!!.text = (listOfQuestion!![numberOfActualAns].text)

        resetBColors()
    }

    private fun setColorOfButtons(correct: Button, false1: Button, false2: Button, false3: Button) {
        correct.setBackgroundColor(Color.GREEN)
        false1.setBackgroundColor(Color.RED)
        false2.setBackgroundColor(Color.RED)
        false3.setBackgroundColor(Color.RED)
    }

    private fun highLightAnswer() {

        when(listOfQuestion!![progress!!.progress].correctAnswer) {
            1-> setColorOfButtons(ans1!!, ans2!!, ans3!!, ans4!!)
            2-> setColorOfButtons(ans2!!, ans1!!, ans3!!, ans4!!)
            3-> setColorOfButtons(ans3!!, ans1!!, ans2!!, ans4!!)
            4-> setColorOfButtons(ans4!!, ans1!!, ans2!!, ans3!!)
        }
    }

    private fun resetBColors() {
        ans1!!.setBackgroundColor(Color.DKGRAY)
        ans2!!.setBackgroundColor(Color.DKGRAY)
        ans3!!.setBackgroundColor(Color.DKGRAY)
        ans4!!.setBackgroundColor(Color.DKGRAY)
    }

}