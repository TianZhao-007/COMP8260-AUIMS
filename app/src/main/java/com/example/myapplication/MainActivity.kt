package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

//    val BtnGoogle = findViewById<Button>(R.id.google)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val btn_login = findViewById<Button>(R.id.loginbt)
        val btn_reset = findViewById<TextView>(R.id.forgetpass)

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            username.setText("comp8260")
            password.setText("comp8260")
        }

        // set on-click listener
        btn_login.setOnClickListener {
            val user_name = username.text;
            val password = password.text;
            Toast.makeText(this@MainActivity, "Welcome,comp8260", Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same
            val intent = Intent(this,NavActivity::class.java)
            startActivity(intent)

        }
//
//        setContentView(R.layout.fragment_gallery)
//        BtnGoogle.setOnClickListener()





        }
}

