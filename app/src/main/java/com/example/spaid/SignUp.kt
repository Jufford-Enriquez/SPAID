package com.example.spaid

import android.content.Intent
import android.icu.text.IDNA.Info
import android.location.Address
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUp : AppCompatActivity() {

    private lateinit var name:EditText
    private lateinit var sex:EditText
    private lateinit var address:EditText
    private lateinit var number:EditText
    private lateinit var contactperson:EditText
    private lateinit var contactpersonInfo:EditText

    private lateinit var emailacount:EditText
    private lateinit var passwordaccount:EditText
    private lateinit var createAcc:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        name = findViewById(R.id.Name)
        sex = findViewById(R.id.Sex)
        address = findViewById(R.id.Address)
        number = findViewById(R.id.numberInfo)
        contactperson = findViewById(R.id.contactPerson)
        contactpersonInfo = findViewById(R.id.contactPersonInfo)

        emailacount = findViewById(R.id.emailAccount)
        passwordaccount = findViewById(R.id.emailPassword)

        // Button
        createAcc = findViewById(R.id.createAccount)


        createAcc.setOnClickListener {
            val intent= Intent (this@SignUp,MainActivity::class.java)
                intent.putExtra("email",emailacount.text.toString())
                intent.putExtra("password",passwordaccount.text.toString())

           startActivity(Intent(this@SignUp,Home::class.java)
               .putExtra("name",name.text.toString())
               .putExtra("sex",sex.text.toString())
               .putExtra("address",address.text.toString())
               .putExtra("number",number.text.toString())
               .putExtra("contactperson",contactperson.text.toString())
               .putExtra("contact Person's number",contactperson.text.toString()))
        }

    }
}