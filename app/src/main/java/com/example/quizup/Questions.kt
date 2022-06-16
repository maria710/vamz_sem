package com.example.quizup

object Questions {

    /**
     * vytvorenie listu otazok pre history
     */
    fun getHistoryQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("Which year was George H.W. Bush elected president?", "1988", "1898", "1954", "1967", 1)
        val q2 =  Question("Where was Martin Luther King, Jr. born?", "Georgia", "New Mexico", "Hawaii", "Illinois", 1)
        val q3 =  Question("Who was president during the Cuban Missile Crisis?", "Bil Clinton", "John F. Kennedy", "Woodrow Wilson", "Hebert Hoover", 2)

        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }

    /**
     * vytvorenie listu otazok pre technology
     */
    fun getTechnologyQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("What year did the first Apple iPhone launch?", "2011", "2008", "2001", "2007", 4)
        val q2 =  Question("What does LG stand for in LG Electronics?", "Lucky-Goldfish", "Light-Gold", "Lucky-Goldstar", "Lucky-Gold", 3)
        val q3 =  Question("Originally Amazon only sold which product?", "Books", "Electronics", "Clothes", "Wigs", 1)

        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }

    /**
     * vytvorenie listu otazok pre nature
     */
    fun getNatureQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("Lemurs are only native to which country?", "Madagaskar", "Australia", "Thailand", "Brazil", 4)
        val q2 =  Question("How tall is a baby giraffe at birth?", "1.2", "1.75", "1.85", "0.85", 3)
        val q3 =  Question("What type of creature is a Pacific Sea Wasp?", "Starfish", "Shark", "Lionfish", "Jellyfish", 4)

        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }

    /**
     * vytvorenie listu otazok pre films
     */
    fun getFilmsQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("The code in The Matrix comes from what food recipes?", "Sushi", "Dumplings", "Pancakes", "Jacket potato", 1)
        val q2 =  Question("Where were The Lord of the Rings movies filmed?", "Ireland", "Iceland", "Australia", "New Zealand", 4)
        val q3 =  Question("What is the name of the fictional land where Frozen takes place?", "Arendelle", "Florin", "Grimm", "Naples", 1)
        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }

    /**
     * vytvorenie listu otazok pre android
     */
    fun getAndroidQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("Which folder do you copy and paste an image into?", "Java", "Values", "Drawable", "Xml", 3)
        val q2 =  Question("What is the system image that the virtual device was set up to support?", "KitKat", "Ice-cream sandwich", "JellyBean", "Marshmallow", 4)
        val q3 =  Question("Which listener is called for the device to register the enter key press?", "OnKeyListener", "OnContextClickListener", "OnClickListener", "OnHoverListener", 1)

        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }

    /**
     * vytvorenie listu otazok pre animals
     */
    fun getAnimalsQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("Which bird can fly backwards?", "Hummingbird", "Owl", "Eagle", "Crow", 1)
        val q2 =  Question("How many noses does slug have?", "1", "0", "6", "4", 4)
        val q3 =  Question("Which color is polar bear skin?", "White", "Brown", "Black", "Dark gray", 3)

        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }
    /**
     * vytvorenie listu otazok pre body
     */
    fun getHumanBodyQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("How many bones do infants have?", "450", "280", "380", "300", 4)
        val q2 =  Question("Which part of body continues to grow whole life?", "Nose", "Eyes", "Fingers", "Neck", 1)
        val q3 =  Question("What is the largest oran?", "Lungs", "Heart", "Stomach", "Skin", 4)

        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }

    /**
     * vytvorenie listu otazok pre geography
     */
    fun getGeographyQuestions(): ArrayList<Question> {

        val list = ArrayList<Question>()

        val q1 = Question("What country has the largest population in the world?", "Canada", "China", "USA", "Russia", 2)
        val q2 =  Question("How many States does the United States consist of?", "54", "52", "50", "55", 3)
        val q3 =  Question("What planet is closest to Earth?", "Mars", "Venus", "Jupiter", "Saturn", 2)

        list.add(q1)
        list.add(q2)
        list.add(q3)

        return list
    }
}