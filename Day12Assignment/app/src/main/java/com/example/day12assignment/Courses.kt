package com.example.day12assignment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Courses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_courses)

        val androidCard = findViewById<CardView>(R.id.cardAndroid)
        val javaCard = findViewById<CardView>(R.id.cardJava)
        val salesforceCard = findViewById<CardView>(R.id.cardSalesforce)
        val sqlCard = findViewById<CardView>(R.id.cardSQL)
        val webCard = findViewById<CardView>(R.id.cardWeb)
        val apexCard = findViewById<CardView>(R.id.cardApex)

        androidCard.setOnClickListener {
            startActivity(Intent(this, Android::class.java))
        }

        javaCard.setOnClickListener {
            startActivity(Intent(this, Java::class.java))
        }

        salesforceCard.setOnClickListener {
            startActivity(Intent(this, Salesforce::class.java))
        }

        sqlCard.setOnClickListener {
            startActivity(Intent(this, SQL::class.java))
        }

        webCard.setOnClickListener {
            startActivity(Intent(this, Web::class.java))
        }

        apexCard.setOnClickListener {
            startActivity(Intent(this, Apex::class.java))
        }

        val buttonContact = findViewById<Button>(R.id.buttonContact)

        buttonContact.setOnClickListener {

            val uri = Uri.parse("tel:8235059566")

            val intent = Intent(Intent.ACTION_DIAL, uri)

            startActivity(intent)
        }

    }
}