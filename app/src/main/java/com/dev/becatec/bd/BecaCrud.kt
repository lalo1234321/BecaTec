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
        values.put(BecaContract.Companion.Entrada.COLUMN_INSTITUCION,item.institucion)
        values.put(BecaContract.Companion.Entrada.COLUMN_DESC, item.desc)
        values.put(BecaContract.Companion.Entrada.COLUMN_IMAGE, item.image)
        values.put(BecaContract.Companion.Entrada.COLUMN_URL, item.url)
        values.put(BecaContract.Companion.Entrada.COLUMN_status, item.status)
        val newRow = db.insert(BecaContract.Companion.Entrada.TABLE_NAME, null, values)

        db.close()
    }
    fun getBecas():ArrayList<Becas> {
        var items:ArrayList<Becas> = ArrayList()
        val db:SQLiteDatabase = helper?.readableDatabase!!

        //Especificar columnas que quiero extraer
        val columnas = arrayOf<String>(
            BecaContract.Companion.Entrada.COLUMN_ID,
            BecaContract.Companion.Entrada.COLUMN_INSTITUCION,
            BecaContract.Companion.Entrada.COLUMN_DESC,
            BecaContract.Companion.Entrada.COLUMN_URL,
            BecaContract.Companion.Entrada.COLUMN_IMAGE,
            BecaContract.Companion.Entrada.COLUMN_status
        )

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
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_INSTITUCION)),
                c.getString(c.getColumnIndexOrThrow(BecaContract.Companion.Entrada.COLUMN_DESC)),
                "https://www.nj.com/resizer/mg42jsVYwvbHKUUFQzpw6gyKmBg=/1280x0/smart/advancelocal-adapter-image-uploads.s3.amazonaws.com/image.nj.com/home/njo-media/width2048/img/somerset_impact/photo/sm0212petjpg-7a377c1c93f64d37.jpg",
                "active",
                "www.ITTol.com"
            ))

        }

        //Cerrar conexión
        db.close()
        return items
    }
}