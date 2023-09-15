package com.example.kotlin_login_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_login_intent.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {

    private lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val value1 = intent.getStringExtra("usn")
        val value2 = intent.getStringExtra("email")
        val value3 = intent.getStringExtra("phone")

        with(binding){
            tvUsername.text = value1
            tvEmail.text = value2
            tvPhone.text = value3
        }
    }
}