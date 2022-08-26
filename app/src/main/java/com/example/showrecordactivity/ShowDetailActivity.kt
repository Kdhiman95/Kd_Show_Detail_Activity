package com.example.showrecordactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ShowDetailActivity : AppCompatActivity() {

    private lateinit var showDetail : TextView
    private lateinit var newRecordBtn : Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_detail)

        val name = intent.getStringExtra("Name")
        val age = intent.getStringExtra("Age")
        val city = intent.getStringExtra("City")
        showDetail = findViewById(R.id.showDetail2)
        showDetail.text = "\n$name\n$age\n$city"

        newRecordBtn = findViewById(R.id.newRecordBtn)

        newRecordBtn.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}