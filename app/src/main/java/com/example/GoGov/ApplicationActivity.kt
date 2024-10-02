package com.example.GoGov

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ApplicationActivity : AppCompatActivity() {
    private val PICK_PDF_CODE = 234

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application)

        findViewById<Button>(R.id.btnUploadDocument).setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "application/pdf"
            startActivityForResult(intent, PICK_PDF_CODE)
        }

        findViewById<Button>(R.id.btnSubmitApplication).setOnClickListener {
            // Submit application logic here
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == PICK_PDF_CODE && resultCode == RESULT_OK && data != null) {
            val uri = data.data
            // Upload file logic
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}
