package com.dev.becatec

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.dev.becatec.bd.BecaContract
import com.dev.becatec.bd.BecaCrud
import com.dev.becatec.bd.DataBaseHelper

class Login : AppCompatActivity() {
    var crud:BecaCrud? = null
    var correo : String=""
    var contrasenia : String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var bIiciarSesion = findViewById<Button>(R.id.button2)
        var bRegistrarse= findViewById<Button>(R.id.button4)
        crud = BecaCrud(this)
        if(crud?.checkEmpty()!!){
            crud?.insertarBecas()
            println("ejecutado dentro de la validacion")
        }
        var etCorreo = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var etContrasena = findViewById<EditText>(R.id.editTextTextPassword3)

        bIiciarSesion.setOnClickListener {
            correo=etCorreo.text.toString()
            contrasenia=etContrasena.text.toString()
            val intent = Intent(this, PaginaInicio::class.java)
            intent.putExtra("correo",correo)
            intent.putExtra("contrasenia",contrasenia)
            startActivity(intent)
        }
        bRegistrarse.setOnClickListener{
            startActivity(Intent(this, Register::class.java))
        }
    }

}