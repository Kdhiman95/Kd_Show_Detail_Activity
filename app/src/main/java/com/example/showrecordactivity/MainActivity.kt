package com.example.showrecordactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var inputName : EditText
    private lateinit var nameNextBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputName = findViewById(R.id.inputName)
        nameNextBtn = findViewById(R.id.nameNextBtn)

        nameNextBtn.setOnClickListener{
            if(inputName.text.isEmpty()){
                inputName.error = "Enter your name"
            } else {
                val intent = Intent(this, GetAgeActivity::class.java)
                intent.putExtra("Name",inputName.text.toString())
                startActivity(intent)
            }
        }
    }
}