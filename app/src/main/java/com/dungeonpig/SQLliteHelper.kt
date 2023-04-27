package com.dungeonpig

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLliteHelper (context: Context) : SQLiteOpenHelper (context, DATABASE_NAME, factory,  DATABASE_VERSION){
   companion object{
       private const val DATABASE_VERSION=1
       private const val DATABASE_NAME= "pg.db"
       private val factory=null
       private const val TBLpg="TBLpg"
       private const val nome= "nome"
       private const val attacco= "A"
       private const val ciapapuerk="C"
       private const val resistenza="R"
       private var descrizione=null
       private var immagine=null

   }
    override fun onCreate(p0: SQLiteDatabase?) {
      val createTBlpg= ("CREATE TABLE"+ TBLpg + "("
              + nome + "TEXT PRIMARY KEY"
              + attacco + "INTEGER"
              + ciapapuerk + "INTEGER"
              + resistenza + "INTEGER"
              + descrizione+ "TEXT"
              + immagine + "DRAWABLE" + ")")
        p0?.execSQL (createTBlpg)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
    fun getpg(NOME : String){
        val selectQuery ="SELECT * FROM $TBLpg WHERE $nome=$NOME"
        val db= this.readableDatabase
        val cursor: Cursor?
        try {
        cursor =db.rawQuery(selectQuery, null)
        }catch (e: java.lang.Exception){
            e.printStackTrace()
        }
        db.execSQL(selectQuery)
    }
}