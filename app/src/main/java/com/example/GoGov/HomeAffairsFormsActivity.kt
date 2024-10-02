package com.example.GoGov

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeAffairsFormsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_affairs_forms)

        val btnPassportApplication: Button = findViewById(R.id.btn_passport_application)
        val btnIdRenewal: Button = findViewById(R.id.btn_id_renewal)

        // Passport Application Button Click
        btnPassportApplication.setOnClickListener {
            val intent = Intent(this, PassportApplicationActivity::class.java)
            startActivity(intent)
        }

        // ID Renewal Button Click
        btnIdRenewal.setOnClickListener {
            val intent = Intent(this, IdRenewalActivity::class.java)
            startActivity(intent)
        }
    }
}
