package com.dev.becatec

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dev.becatec.bd.BecaContract
import com.dev.becatec.bd.BecaCrud
import com.dev.becatec.bd.UserCrud
import com.dev.becatec.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    var us_crud:UserCrud? = null
    var be_crud:BecaCrud? = null
    var correo = ""
    var contrasenia = ""
    var user:ArrayList<Users> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLogin()

        binding.btnLogin.setOnClickListener { validateData() }
        binding.btnGoRegister.setOnClickListener{ goRegisterUser() }
    }

    fun initLogin(){
        us_crud = UserCrud(this)
        be_crud = BecaCrud(this)
        if(be_crud?.checkEmpty()!!){
            be_crud?.insertarBecas()
            println("ejecutado dentro de la validacion")
        }

    }

    fun goRegisterUser(){
        startActivity(Intent(this, Register::class.java))
    }

    fun validateData(){
        correo = binding.editTextTextEmailAddress.text.toString()
        contrasenia = binding.editTextTextPassword3.text.toString()
        if (validUser()){
            goRegisterUser()
        }else{
            showLoginError()
        }
    }

    fun userExists():Boolean{
        user = us_crud!!.getUser(correo)
        return user.size > 0
    }

    fun validUser():Boolean{
        return userExists() && user[0].password == contrasenia
    }

    fun showLoginError(){
        val message = "Datos ingresados de manera incorrecta"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(this, message, duration).show()
    }

}