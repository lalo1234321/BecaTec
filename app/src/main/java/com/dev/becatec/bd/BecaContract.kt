package com.dev.becatec.bd

import android.provider.BaseColumns

class BecaContract {
    companion object{
        val VERSION = 3
        class Entrada:BaseColumns{
            companion object{
                val TABLE_NAME = "BecasV14"
                val COLUMN_ID = "id"
                val COLUMN_ING="ingeniería"
                val COLUMN_INSTITUCION = "institucion"
                val COLUMN_NOMBRE_BECA= "beca"
                val COLUMN_DESC = "desc"
                val COLUMN_REQUISITOS="requisitos"
                val COLUMN_IMAGE = "image"
                val COLUMN_TIPO = "tipo"
                val COLUMN_URL = "url"
            }
        }
    }
}