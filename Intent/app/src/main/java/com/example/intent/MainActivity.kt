package com.example.intent

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Open Image Activity
        val imageBtn = findViewById<Button>(R.id.button)

        imageBtn.setOnClickListener {
            val intent = Intent(this, ImageShow::class.java)
            startActivity(intent)
        }

        // Phone Call
        val phoneButton = findViewById<Button>(R.id.buttonPhone)

        phoneButton.setOnClickListener {

            val intent = Intent(
                Intent.ACTION_CALL,
                Uri.parse("tel:9876543210")
            )

            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    100
                )
                return@setOnClickListener
            }

            startActivity(intent)
        }

        // Open LinkedIn
        val linkedinButton = findViewById<Button>(R.id.buttonLinkedin)

        linkedinButton.setOnClickListener {

            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.linkedin.com/")
            )

            startActivity(intent)
        }
    }
}