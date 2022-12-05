package com.dev.becatec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import com.dev.becatec.adapter.BecaAdapter
import com.dev.becatec.bd.BecaCrud
import kotlinx.android.synthetic.main.activity_pagina_inicio.*

@Suppress("UNREACHABLE_CODE")
class PaginaInicio : AppCompatActivity() {
    val carreraslista = arrayOf("Ingenierias","Electronica","Gestion Empresarial","Industrial","Logistica","Mecatronica","Quimica","Sistemas Computacionales","TICS")
    val becas = arrayOf("Becas","Apoyo Economico","Manutencion","Estudios","Movilidad","Egreso/Tesis")
    var correoIntent : String = ""
    var text1: String =""
    var text2: String= ""

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_inicio)

       val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,carreraslista)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        carreras1.adapter = adapter
        carreras1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                text1 = parent?.getItemAtPosition(position).toString()


            }
        }
        val adapterb = ArrayAdapter(this, android.R.layout.simple_spinner_item, becas)
        adapterb.setDropDownViewResource(android.R.layout.simple_spinner_item)
        becas1.adapter = adapterb
        becas1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                text2 = parent?.getItemAtPosition(position).toString()

            }
        }
        val bBuscar = findViewById<Button>(R.id.bBuscar2)
        bBuscar.setOnClickListener {
           // println(text1)
            //println(text2)
            val abrirRBD= Intent(this, ResultadosBD()::class.java)
            abrirRBD.putExtra("ingenieria",text1)
            abrirRBD.putExtra("beca",text2)
            startActivity(abrirRBD)
        }

    }
    /*private fun condition1(){
        Toast.makeText(this, "selected Item"+carreras1.selectedItem, Toast.LENGTH_LONG).show()
    }*/
}

