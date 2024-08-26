package com.example.quiz.model

import android.widget.ImageView
import android.widget.TextView

class QuizModel {

    private  val questions = Constant.questions
    private var  questionIndex = 0

    private fun getQuestion() =  questions[questionIndex]


   private  fun setQuestion(tv:TextView, image:ImageView){
       tv.text = getQuestion().question
      image.setImageResource(getQuestion().image)

   }
    fun next(tv:TextView, image:ImageView){
        if(questionIndex < questions.lastIndex){
            questionIndex++
            setQuestion(tv,image)
        }

    }



}