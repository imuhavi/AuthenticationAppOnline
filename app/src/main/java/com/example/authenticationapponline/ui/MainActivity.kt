package com.example.authenticationapponline.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.authenticationapponline.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to all views
        var username = findViewById<EditText>(R.id.user_name)
        var password = findViewById<EditText>(R.id.password)
        var btn_reset = findViewById<Button>(R.id.btn_reset)
        var btn_login = findViewById<Button>(R.id.btn_submit)

        btn_reset.setOnClickListener{
            //clearing user_name and password edit text views on reset button click
            username.setText("")
            password.setText("")
        }
        btn_login.setOnClickListener {
            val user_name = username.text;
            val passwd = password.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()
             //validate
        }
    }
}