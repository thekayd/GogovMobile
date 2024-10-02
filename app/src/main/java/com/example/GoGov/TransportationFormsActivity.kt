package com.example.GoGov

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class TransportationFormsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transportation_forms)

        val driversLicenseButton: Button = findViewById(R.id.btn_drivers_license)

        driversLicenseButton.setOnClickListener {
            val intent = Intent(this, DriversLicenseActivity::class.java)
            startActivity(intent)
        }
    }
}
