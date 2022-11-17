package com.dev.becatec.bd

import android.provider.BaseColumns

class BecaContract {
    companion object{
        val VERSION = 1
        class Entrada:BaseColumns{
            companion object{
                val TABLE_NAME = "BecasV13"
                val COLUMN_ID = "id"
                val COLUMN_INSTITUCION = "institucion"
                val COLUMN_NOMBRE_BECA= "beca"
                val COLUMN_DESC = "desc"
                val COLUMN_IMAGE = "image"
                val COLUMN_status = "status"
                val COLUMN_URL = "url"
            }
        }
    }
}