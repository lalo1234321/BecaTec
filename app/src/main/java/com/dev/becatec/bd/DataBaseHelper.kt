package com.dev.becatec.bd


import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHelper(context:Context):SQLiteOpenHelper(context, BecaContract.Companion.Entrada.TABLE_NAME, null, BecaContract.Companion.VERSION) {

    companion object {
        val CREATE_BECA_TABLE = "CREATE TABLE " + BecaContract.Companion.Entrada.TABLE_NAME +" (" + BecaContract.Companion.Entrada.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                BecaContract.Companion.Entrada.COLUMN_INSTITUCION +" TEXT, " +
                ""+BecaContract.Companion.Entrada.COLUMN_ING+" TEXT, "+
                ""+BecaContract.Companion.Entrada.COLUMN_NOMBRE_BECA+" TEXT, "+
                ""+BecaContract.Companion.Entrada.COLUMN_DESC+" TEXT, " +
                ""+BecaContract.Companion.Entrada.COLUMN_REQUISITOS+" TEXT, "+
                ""+BecaContract.Companion.Entrada.COLUMN_URL +" TEXT, " +
                ""+BecaContract.Companion.Entrada.COLUMN_IMAGE +" TEXT, " +
                ""+BecaContract.Companion.Entrada.COLUMN_TIPO +" TEXT )"

        val CREATE_USER_TABLE = "CREATE TABLE " + UserContract.Companion.Entrada.TABLE_NAME +" (" + UserContract.Companion.Entrada.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                UserContract.Companion.Entrada.COLUMN_EMAIL +" TEXT, " +
                ""+UserContract.Companion.Entrada.COLUMN_PASSWORD+" TEXT )"


        val REMOVE_BECA_TABLE = "DROP TABLE IF EXISTS "+BecaContract.Companion.Entrada.TABLE_NAME
        val REMOVE_USER_TABLE = "DROP TABLE IF EXISTS "+UserContract.Companion.Entrada.TABLE_NAME
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_BECA_TABLE)
        db?.execSQL(CREATE_USER_TABLE)
    }


   override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(REMOVE_BECA_TABLE)
        db?.execSQL(REMOVE_USER_TABLE)
        onCreate(db)
    }

}

