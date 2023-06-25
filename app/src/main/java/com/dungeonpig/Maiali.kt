package com.dungeonpig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView

class Maiali : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maiali)
        val ImageButton1= findViewById<ImageButton>(R.id.home_pig)
        ImageButton1.setOnClickListener{
            val intent = Intent(this, principale::class.java)
            startActivity(intent)}
        val dbHelperp = dbhelp(this)
        val nameListp: List<String> = dbHelperp.querypig()
        val adp = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameListp)
        val listp: ListView = findViewById(R.id.pig_list)
        listp.adapter=adp




    }
}