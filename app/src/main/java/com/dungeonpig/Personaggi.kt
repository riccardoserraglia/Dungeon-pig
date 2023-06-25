package com.dungeonpig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView


class Personaggi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personaggi)
        val ImageButton1= findViewById<ImageButton>(R.id.home_pg)
        ImageButton1.setOnClickListener{
            val intent = Intent(this, principale::class.java)
            startActivity(intent)}

        val dbHelper = dbhelp(this)
        val nameList: List<String> = dbHelper.querypg()
        val ad = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        val list= findViewById<ListView>(R.id.pg_list)
list.adapter=ad



    }}