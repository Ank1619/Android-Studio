package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDownload = findViewById<Button>(R.id.buttonDownload)
        val buttonUpload = findViewById<Button>(R.id.buttonUpload)

        buttonDownload.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Downloading...",
                Toast.LENGTH_SHORT
            ).show()
        }
        buttonUpload.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Uploading...",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}