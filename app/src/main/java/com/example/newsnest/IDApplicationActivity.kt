package com.example.newsnest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
class IDApplicationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_id_application)

        val btnSubmitApplication: Button = findViewById(R.id.btn_submit_application)

        btnSubmitApplication.setOnClickListener {
            // Code to handle form submission
        }
    }
}
