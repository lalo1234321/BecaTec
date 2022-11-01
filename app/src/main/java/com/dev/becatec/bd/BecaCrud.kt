package com.dev.becatec.bd

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.dev.becatec.Becas

class BecaCrud(context:Context) {
    private var helper:DataBaseHelper? = null
    init {
        this.helper = DataBaseHelper(context)
    }
    fun newBeca(item:Becas) {

        //abrir conexión a base de datos en modo lectura
        val db: SQLiteDatabase = helper?.writableDatabase!!
        //mapea de columnas a insertar
        val values = ContentValues()
        values.put(BecaContract.Companion.Entrada.COLUMN_ID, item.id)
        values.put(BecaContract.Companion.Entrada.COLUMN_NAME,item.institucion)
        val newRow = db.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values)

        db.close()
    }
    fun getBecas():ArrayList<Becas> {
        var items:ArrayList<Becas> = ArrayList()
        val db:SQLiteDatabase = helper?.readableDatabase!!

        //Especificar columnas que quiero extraer
        val columnas = arrayOf<String>(BecaContract.Companion.Entrada.COLUMN_ID, BecaContract.Companion.Entrada.COLUMN_NAME)

        //Crear cursor para recorrer la tabla
        val c: Cursor = db.query(
            BecaContract.Companion.Entrada.TABLE_NAME,
            columnas,
            null,
            null,
            null,
            null,
            null
        )

        //Realizar recorrido del cursor en la tabla
        while( c.moveToNext() ) {
            items.add( Becas(
                c.getInt(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_ID)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_NAME)),
                "Beca Manutencion",
                "https://rinacional.tecnm.mx/retrieve/c0721389-bb57-49fd-ad75-9be56bbed922",
                "active",
                "www.ITTol.com"
            ))

        }

        //Cerrar conexión
        db.close()
        return items
    }
}