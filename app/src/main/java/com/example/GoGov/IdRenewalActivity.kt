package com.example.GoGov

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class IdRenewalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_id_renewal)

        val btnSubmitRenewal: Button = findViewById(R.id.btn_submit_renewal)

        btnSubmitRenewal.setOnClickListener {
            // Code to handle form submission
        }
    }
}
