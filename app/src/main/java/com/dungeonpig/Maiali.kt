package com.dungeonpig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Maiali : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maiali)
        val button1= findViewById<Button>(R.id.home_pig)
        button1.setOnClickListener{
            val intent = Intent(this, principale::class.java)
            startActivity(intent)}
    }
}