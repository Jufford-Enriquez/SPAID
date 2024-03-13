package com.example.spaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //User's Input
    private lateinit var email: EditText
    private lateinit var password:EditText

    // Buttons for Signup & Login
    private lateinit var buttonSignUp :Button
    private lateinit var buttonLogin :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email =findViewById(R.id.emailSignin)
        password = findViewById(R.id.Textpassword)

        buttonSignUp = findViewById(R.id.signupButton)
        buttonLogin = findViewById(R.id.loginButton)


        val useremail = intent.getStringExtra("email")
        val userpassword = intent.getStringExtra("password")
        email.setText(useremail)
        password.setText(userpassword)


        // launches to signupActivity
        buttonSignUp.setOnClickListener {
        val intent = Intent(this,SignUp::class.java)
startActivity(intent)
        }

        // launches to Home_and_History Activity
        buttonLogin.setOnClickListener {
            val intent = Intent(this,Home_and_History::class.java)
            startActivity(intent)
        }
    }
}