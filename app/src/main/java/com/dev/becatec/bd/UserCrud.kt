package com.dev.becatec.bd

import android.content.Context
import android.content.ContentValues
import android.database.Cursor
import android.database.DatabaseUtils
import android.database.sqlite.SQLiteDatabase
import android.widget.Toast
import com.dev.becatec.Users

class UserCrud(context:Context) {
    private var helper:DataBaseHelper? = null
    init {
        this.helper = DataBaseHelper(context)
    }
    fun newUser(item:Users){
        //abrir conexión a base de datos en modo lectura
        val db: SQLiteDatabase = helper?.writableDatabase!!
        //mapea de columnas a insertar
        val values = ContentValues()
        values.put(UserContract.Companion.Entrada.COLUMN_ID, item.id)
        values.put(UserContract.Companion.Entrada.COLUMN_EMAIL, item.email)
        values.put(UserContract.Companion.Entrada.COLUMN_PASSWORD,item.password)
        db.close()
    }

    fun insertUser(email:String, password:String){
        val dab:SQLiteDatabase = helper?.writableDatabase!!
        val value = ContentValues().apply {
            put(UserContract.Companion.Entrada.COLUMN_EMAIL,email)
            put(UserContract.Companion.Entrada.COLUMN_PASSWORD,password)
        }
        dab?.insert(UserContract.Companion.Entrada.TABLE_NAME,null, value)
        dab.close()
    }

    fun checkEmpty():Boolean{
        val dab:SQLiteDatabase = helper?.writableDatabase!!
        val tabla:String = UserContract.Companion.Entrada.TABLE_NAME
        return DatabaseUtils.queryNumEntries(dab,tabla) ==0L
    }

    fun getUser(email: String):ArrayList<Users> {

        var items:ArrayList<Users> = ArrayList()
        val db:SQLiteDatabase = helper?.readableDatabase!!

        //Especificar columnas que quiero extraer
        val columnas = arrayOf<String>(
            UserContract.Companion.Entrada.COLUMN_ID,
            UserContract.Companion.Entrada.COLUMN_EMAIL,
            UserContract.Companion.Entrada.COLUMN_PASSWORD
        )

        //Crear cursor para recorrer la tabla
        val c: Cursor = db.query(
            UserContract.Companion.Entrada.TABLE_NAME,
            columnas,
            null,
            null,
            null,
            null,
            null
        )
        //Realizar recorrido del cursor en la tabla
        while( c.moveToNext() ) {
            val user_id = c.getInt(c.getColumnIndexOrThrow(UserContract.Companion.Entrada.COLUMN_ID))
            val user_mail =  c.getString(c.getColumnIndexOrThrow(UserContract.Companion.Entrada.COLUMN_EMAIL))
            val user_pass = c.getString(c.getColumnIndexOrThrow(UserContract.Companion.Entrada.COLUMN_PASSWORD))

            if (user_mail == email){
                items.add( Users(
                    user_id,user_mail,user_pass
                ))
            }
        }
        //Cerrar conexión
        db.close()
        return items
    }


}