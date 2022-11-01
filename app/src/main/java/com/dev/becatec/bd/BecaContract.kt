package com.dev.becatec.bd

import android.provider.BaseColumns

class BecaContract {
    companion object{
        val VERSION = 1
        class Entrada:BaseColumns{
            companion object{
                val TABLE_NAME = "Beca"
                val COLUMN_ID = "id"
                val COLUMN_NAME = "name"
            }
        }
    }
}