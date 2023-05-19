package com.dungeonpig

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import java.io.BufferedReader
import java.io.InputStreamReader

class dbhelp(context: Context) {
    private val db: SQLiteDatabase

    init {
        val inputStream = context.applicationContext.assets.open("dungeonpig.db")
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val stringBuilder = StringBuilder()
        var line: String? = bufferedReader.readLine()
        while (line != null) {
            stringBuilder.append(line)
            line = bufferedReader.readLine()
        }
        bufferedReader.close()
        val dbString = stringBuilder.toString()
        db = SQLiteDatabase.openDatabase(dbString, null, SQLiteDatabase.OPEN_READONLY)
    }

    fun close() {
        db.close()
    }
}
