package com.dev.becatec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pagina_inicio.*

@Suppress("UNREACHABLE_CODE")
class PaginaInicio : AppCompatActivity() {

    val carreraslista = arrayOf("Ingenierias","Electronica","Gestion Empresarial","Industrial","Logistica","Mecatronica","Quimica","SistemasComputacionales","TICS")
    val becas = arrayOf("Becas","Apoyo Economico","Manutencion","Estudios","Movilidad","Intercambio","Alojamiento")
    var correoIntent : String = ""
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

                if(carreras1.selectedItemPosition ==0){
                   condition1()
                }
                if(carreras1.selectedItemPosition ==1){
                    condition2()
                }
                if(carreras1.selectedItemPosition ==2){
                    condition3()
                }
            }
        }
        val adapterb = ArrayAdapter(this, android.R.layout.simple_spinner_item, becas)
        adapterb.setDropDownViewResource(android.R.layout.simple_spinner_item)
        becas1.adapter = adapterb
        becas1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (becas1.selectedItemPosition ==0){
                    condition4()
                }
                if (becas1.selectedItemPosition ==1){
                    condition5()
                }
                if (becas1.selectedItemPosition ==2){
                    condition6()
                }
            }
        }
        val bBuscar = findViewById<Button>(R.id.bBuscar2)
        bBuscar.setOnClickListener {
            startActivity(Intent(this, ResultadosBD::class.java))
        }
    }
    private fun condition1(){
        Toast.makeText(this, "selected Item"+carreras1.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun condition2(){
        Toast.makeText(this, "selected Item"+carreras1.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun condition3(){
        Toast.makeText(this, "cheked Item", Toast.LENGTH_LONG).show()
    }
    private fun condition4(){
        Toast.makeText(this, "selected Item"+carreras1.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun condition5(){
        Toast.makeText(this, "selected Item"+carreras1.selectedItem, Toast.LENGTH_LONG).show()
    }
    private fun condition6(){
        Toast.makeText(this, "cheked Item", Toast.LENGTH_LONG).show()
    }


}