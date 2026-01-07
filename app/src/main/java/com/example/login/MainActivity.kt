package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val etUser = findViewById<EditText>(R.id.etUser)
        val etPwd = findViewById<EditText>(R.id.etPwd)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        val correctUser = "admin"
        val correctPass = "admin"

        btnLogin.setOnClickListener {

            val user = etUser.text.toString().trim()
            val pass = etPwd.text.toString().trim()

            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please enter username and password",
                    Toast.LENGTH_LONG
                ).show()

            } else if (user == correctUser && pass == correctPass) {
                Toast.makeText(
                    this,
                    "Login Successful",
                    Toast.LENGTH_LONG
                ).show()

            } else {
                Toast.makeText(
                    this,
                    "Invalid Username or Password",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
