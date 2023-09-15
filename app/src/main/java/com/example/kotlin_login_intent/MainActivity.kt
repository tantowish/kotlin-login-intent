package com.example.kotlin_login_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin_login_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            tvLogin.setOnClickListener{
                val intent = Intent(this@MainActivity, Login::class.java)
                startActivity(intent)
                finish()
            }

            btnRegister.setOnClickListener{
                val usernameText = username.text.toString().trim()
                val emailText = email.text.toString().trim()
                val password = password.text.toString().trim()
                val isNumber = phone.text.toString().trim()
                if(usernameText.isNotBlank() && emailText.isNotBlank() && password.isNotBlank() && isNumber.isNotBlank()){
                    val intent = Intent(this@MainActivity, HomePage::class.java)
                    intent.putExtra("usn", usernameText)
                    intent.putExtra("email", emailText)
                    intent.putExtra("phone", isNumber)
                    startActivity(intent)
                    finish()
                }
                else{
                    Toast.makeText(this@MainActivity, "Invalid input, please check the input.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}