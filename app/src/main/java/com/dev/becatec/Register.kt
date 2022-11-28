package com.dev.becatec

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dev.becatec.bd.UserCrud
import com.dev.becatec.databinding.ActivityRegisterBinding


class Register:AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    var crud:UserCrud? = null
    var user:ArrayList<Users> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRegister()

    }

    fun initRegister(){
        binding.btnRegister.setOnClickListener { registerUser() }
        crud = UserCrud(this)
    }

    fun registerUser(){
        val email = binding.etEmailAddress.text.toString()
        val pass = binding.editTextTextPassword.text.toString()
        val passconf = binding.editTextTextPassword2.text.toString()
        if (validateEmpty(email,pass)){
            if (validatePassword(pass,passconf)){
                if (validateTermsConditions()){
                    if (!userExists(email)){
                        crud?.insertUser(email,pass)
                        showCreationUser()
                        val intent = Intent(this, Login::class.java)
                        startActivity(intent)
                    }else{ showDuplicatedUser() }
                }else { showConditionError() }
            }else{ showPasswordError() }
        }else{ showEmptyError() }
    }

    fun userExists(email: String):Boolean{
        user = crud!!.getUser(email)
        return user.size > 0
    }

    fun validatePassword(pass1:String, pass2:String):Boolean{
        return pass1==pass2
    }

    fun showDuplicatedUser(){
        val message = "El usuario ya ha sido registrado anteriormente"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, message, duration).show()
    }

    fun validateEmpty(email:String,pass:String):Boolean{
        return email != "" && pass != ""
    }

    fun validateTermsConditions():Boolean{
        return binding.checkBox.isChecked
    }

    fun showPasswordError(){
        val message = "Las contraseñas no son iguales"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, message, duration).show()
    }

    fun showCreationUser(){
        val message = "Usuario Creado Correctamente"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, message, duration).show()
    }

    fun showEmptyError(){
        val message = "Se deben llenar todos los campos"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, message, duration).show()
    }

    fun showConditionError(){
        val message = "Debe aceptar los terminos y condiciones"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, message, duration).show()
    }

}