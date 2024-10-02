package com.example.newsnest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val transportationButton: Button = findViewById(R.id.btn_transportation)
        val healthButton: Button = findViewById(R.id.btn_health)
        val educationButton: Button = findViewById(R.id.btn_education)
        val homeAffairsButton: Button = findViewById(R.id.btn_home_affairs)

        // Transportation Button Click
        transportationButton.setOnClickListener {
            val intent = Intent(this, TransportationFormsActivity::class.java)
            startActivity(intent)
        }

        // Health Button Click
        healthButton.setOnClickListener {
            val intent = Intent(this, HealthFormsActivity::class.java)
            startActivity(intent)
        }

        // Education Button Click
        educationButton.setOnClickListener {
            val intent = Intent(this, EducationFormsActivity::class.java)
            startActivity(intent)
        }

        // Home Affairs Button Click
        homeAffairsButton.setOnClickListener {
            val intent = Intent(this, HomeAffairsFormsActivity::class.java)
            startActivity(intent)
        }
    }
}
