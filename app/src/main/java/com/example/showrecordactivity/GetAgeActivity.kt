package com.example.showrecordactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class GetAgeActivity : AppCompatActivity() {

    private lateinit var inputAge : EditText
    private lateinit var ageNextBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_age)

        inputAge = findViewById(R.id.inputAge)
        ageNextBtn = findViewById(R.id.ageNextBtn)


        ageNextBtn.setOnClickListener{
            val name = intent.getStringExtra("Name")
            intent = Intent(this,GetCityActivity::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Age",inputAge.text.toString())
            startActivity(intent)
        }

    }
}
