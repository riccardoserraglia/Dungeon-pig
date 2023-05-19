package com.dungeonpig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ListView
import android.widget.SimpleCursorAdapter

class Personaggi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personaggi)
        val ImageButton1= findViewById<ImageButton>(R.id.home_pg)
        ImageButton1.setOnClickListener{
            val intent = Intent(this, principale::class.java)
            startActivity(intent)}

        val dbHelper = SQLliteHelper(this)
        val query = "SELECT nome FROM TBLpg"
        val cursor = dbHelper.executeCustomQuery(query)




    }}