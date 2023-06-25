package com.dungeonpig

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import java.io.BufferedReader
import java.io.InputStreamReader

class dbhelp(context: Context) {
    private val db: SQLiteDatabase

    init {
        val input = context.applicationContext.assets.open("dungeonpig.db")
        val bf = BufferedReader(InputStreamReader(input))
        val sb = StringBuilder()
        var line: String? = bf.readLine()
        while (line != null) {
            sb.append(line)
            line = bf.readLine()
        }
        bf.close()
        val dbString = sb.toString()
        db = SQLiteDatabase.openDatabase(dbString, null, SQLiteDatabase.OPEN_READONLY)
    }
    @SuppressLint("Range")
    fun querypg(): List<String> {
        val itemList = mutableListOf<String>()

        val cursor = db.rawQuery("SELECT nome FROM TBLpg", null)

        if (cursor.moveToFirst()) {
            do {
                val nome= cursor.getString(cursor.getColumnIndex("nome"))
                itemList.add(nome)
            } while (cursor.moveToNext())
        }

        cursor.close()
        return itemList
    }
    @SuppressLint("Range")
    fun querycarte(): List<String> {
        val itemList = mutableListOf<String>()

        val cursor = db.rawQuery("SELECT nome FROM TBLcarte", null)

        if (cursor.moveToFirst()) {
            do {
                val nome= cursor.getString(cursor.getColumnIndex("nome"))
                itemList.add(nome)
            } while (cursor.moveToNext())
        }

        cursor.close()
        return itemList
    }
    @SuppressLint("Range")
    fun querypig(): List<String> {
        val itemList = mutableListOf<String>()

        val cursor = db.rawQuery("SELECT nome FROM TBLpig", null)

        if (cursor.moveToFirst()) {
            do {
                val nome = cursor.getString(cursor.getColumnIndex("nome"))
                itemList.add(nome)
            } while (cursor.moveToNext())
        }

        cursor.close()
        return itemList
    }
}
