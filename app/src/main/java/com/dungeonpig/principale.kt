package com.dungeonpig

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class principale : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principale)
        val Button1= findViewById<Button>(R.id.Personaggi)
        Button1.setOnClickListener{
            val intent = Intent(this, Personaggi::class.java)
            startActivity(intent)}

        val button2= findViewById<Button>(R.id.Regole)
        button2.setOnClickListener{
                val intent = Intent(this, Regole::class.java)
                startActivity(intent)}

        val button3= findViewById<Button>(R.id.Carte)
            button3.setOnClickListener{
                val intent = Intent(this, Carte::class.java)
                startActivity(intent)}

        val button4= findViewById<Button>(R.id.Maiali)
            button4.setOnClickListener{
                    val intent = Intent(this, Maiali::class.java)
                    startActivity(intent)}
    }
}