package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.AdapterView
import android.widget.Toast
import com.example.quiz.databinding.ActivityMainBinding
import com.example.quiz.model.QuizModel

class MainActivity : AppCompatActivity(),OnClickListener {
    lateinit var binding:ActivityMainBinding
     val quizModel = QuizModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nextBtn.setOnClickListener(this)
        binding.yesBtn.setOnClickListener(this)
        binding.noBtn.setOnClickListener(this)



    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.next_btn->{
                quizModel.next(binding.questionTv,binding.profileImage)
            }
            R.id.yes_btn->{Toast.makeText(this,"Yes", Toast.LENGTH_SHORT).show()}
            R.id.no_btn->{

            }

        }
    }
}