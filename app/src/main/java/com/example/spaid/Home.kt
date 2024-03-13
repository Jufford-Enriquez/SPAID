package com.example.spaid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Home : AppCompatActivity() {

    private lateinit var userName :EditText
    private lateinit var userGender:EditText
    private lateinit var userAddress:EditText
    private lateinit var userNumInfo:EditText
    private lateinit var userContactPer:EditText
    private lateinit var userConPersonNum:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        userName = findViewById(R.id.nameDisplay)
        userAddress =findViewById(R.id.genderDisplay)
        userGender = findViewById(R.id.addressDisplay)
        userNumInfo = findViewById(R.id.personNumDisplay)
        userContactPer = findViewById(R.id.contactPersonDisplay)
        userConPersonNum = findViewById(R.id.contactPersonNumInfoDisplay)

        val username = intent.getStringExtra("name")
        val gender = intent.getStringExtra("sex")
        val address = intent.getStringExtra("address")
        val numberinfo = intent.getStringExtra("number")
        val contactperson = intent.getStringExtra("contactperson")
        val contactpersonNuminfo = intent.getStringExtra("contact Person's number")

        userName.setText(username)
        userGender.setText(gender)
        userAddress.setText(address)
        userNumInfo.setText(numberinfo)
        userContactPer.setText(contactperson)
        userConPersonNum.setText(contactperson)


    }
}