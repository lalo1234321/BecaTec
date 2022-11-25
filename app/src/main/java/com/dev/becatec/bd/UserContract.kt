package com.dev.becatec.bd

import android.provider.BaseColumns

class UserContract {
    companion object{
        val VERSION = 2
        class Entrada:BaseColumns {
            companion object {
                val TABLE_NAME = "Alumnos"
                val COLUMN_ID = "id"
                val COLUMN_EMAIL = "email"
                val COLUMN_PASSWORD = "password"

            }
        }
    }
}