package com.example.quizup

/**
 * ulozenie textov odpovedi a otazky pre jednu otazku
 */
data class Question (
    val text: String,
    val answer1: String,
    val answer2: String,
    val answer3: String,
    val answer4: String,
    val correctAnswer: Int
)