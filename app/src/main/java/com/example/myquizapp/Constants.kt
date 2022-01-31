package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,"Who is there in the image?",
            R.drawable.ic_cheems,
            "Cheems Bhaiyaji", "Dogeshwar",
            "Shiba Inu", "Pug",
            1
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2,"Who is there in the image?",
            R.drawable.ic_shehnaaz_gill,
            "Tomei", "Shehnaaz Gill",
            "Boring People", "None of My Business",
            2
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3,"Who is there in the image?",
            R.drawable.ic_shikhar_dhawan,
            "Gabbar Paaji", "Md Kaif",
            "Devdutt Paddikal", "Chimku",
            1
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4,"Who is there in the image?",
            R.drawable.ic_agatha,
            "Martha", "Wanda",
            "Agatha", "Natasha",
            3
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5,"Who is there in the image?",
            R.drawable.ic_ramadhir_singh,
            "Sardar Khan", "Faisal",
            "Definite", "Ramadhir",
            4
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            6,"Who is there in the image?",
            R.drawable.ic_momin_shakib,
            "Momin Shakib", "Syed Mustafa",
            "Jarvo", "Kamran Akmal",
            1
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7,"Who is there in the image?",
            R.drawable.ic_venom,
            "Black Spiderman", "Deadpool",
            "Venom", "Carnage",
            3
        )
        questionsList.add(que7)

        // 8
        val que8 = Question(
            8,"Who is there in the image?",
            R.drawable.ic_joey_tribbiani,
            "Essence", "Joey Tribbiani",
            "Chandler Bing", "Hombre",
            2
        )
        questionsList.add(que8)

        // 9
        val que9 = Question(
            9,"Who is there in the image?",
            R.drawable.ic_driver,
            "Pilot", "Sailor",
            "Biker", "Hope You Got It!",
            4
        )
        questionsList.add(que9)

        // 10
        val que10 = Question(
            10,"Who is there in the image?",
            R.drawable.ic_shaheen_afridi,
            "Shahid Afridi", "Hasan Ali",
            "Md Amir", "Shaheen Afridi",
            4
        )
        questionsList.add(que10)

        return questionsList
    }
}