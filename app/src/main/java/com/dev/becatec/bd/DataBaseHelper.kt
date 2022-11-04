package com.dev.becatec.bd


import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHelper(context:Context):SQLiteOpenHelper(context, BecaContract.Companion.Entrada.TABLE_NAME, null, BecaContract.Companion.VERSION) {
    companion object {
        val CREATE_BECA_TABLE = "CREATE TABLE " + BecaContract.Companion.Entrada.TABLE_NAME +" (" + BecaContract.Companion.Entrada.COLUMN_ID + " TEXT PRIMARY KEY, " +
                BecaContract.Companion.Entrada.COLUMN_INSTITUCION +" TEXT, " +
                ""+BecaContract.Companion.Entrada.COLUMN_DESC+" TEXT, " +
                ""+BecaContract.Companion.Entrada.COLUMN_URL +" TEXT, " +
                ""+BecaContract.Companion.Entrada.COLUMN_IMAGE +" TEXT, " +
                ""+BecaContract.Companion.Entrada.COLUMN_status +" TEXT )"

        val REMOVE_BECA_TABLE = "DROP TABLE IF EXISTS "+BecaContract.Companion.Entrada.TABLE_NAME
    }
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_BECA_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(REMOVE_BECA_TABLE)
        onCreate(db)
    }

}