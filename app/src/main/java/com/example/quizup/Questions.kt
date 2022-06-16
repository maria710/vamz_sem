package com.example.quizup

object Questions {

    fun getHistoryQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("Which year was George H.W. Bush elected president?", "1988", "1898", "1954", "1967", 1)
        val q2 =  Question("Where was Martin Luther King, Jr. born?", "Atlanta", "", "", "", 1)
        val q3 =  Question("Who was president during the Cuban Missile Crisis?", "Atlanta", "John F. Kennedy", "", "", 2)

        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }
}