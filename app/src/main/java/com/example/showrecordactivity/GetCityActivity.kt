package com.example.showrecordactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class GetCityActivity : AppCompatActivity() {

    private lateinit var inputCity : EditText
    private lateinit var doneBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_city)

        inputCity = findViewById(R.id.inputCity)
        doneBtn = findViewById(R.id.doneBtn)

        doneBtn.setOnClickListener{
            val name = intent.getStringExtra("Name")
            val age = intent.getStringExtra("Age")
            intent = Intent(this,ShowDetailActivity::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Age",age)
            intent.putExtra("City",inputCity.text.toString())
            startActivity(intent)
        }
    }
}