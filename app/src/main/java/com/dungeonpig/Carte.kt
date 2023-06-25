package com.dungeonpig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView

class Carte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carte)
        val ImageButton1 = findViewById<ImageButton>(R.id.home_card)
        ImageButton1.setOnClickListener {
            val intent = Intent(this, principale::class.java)
            startActivity(intent)
        }

        val dbHelperc = dbhelp(this)
        val nameListc: List<String> = dbHelperc.querycarte()
        val adc = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameListc)
        val listc: ListView = findViewById(R.id.card_list)
        listc.adapter=adc
    }
}