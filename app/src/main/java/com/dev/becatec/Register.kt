package com.dev.becatec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Register:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var bRegistrado = findViewById<Button>(R.id.button3)
        bRegistrado.setOnClickListener {
            startActivity(Intent(this, PaginaInicio::class.java))
        }
    }

}