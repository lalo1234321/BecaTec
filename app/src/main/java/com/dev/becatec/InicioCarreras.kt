package com.dev.becatec

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public abstract class InicioCarreras:AppCompatActivity(), AdapterView.OnItemSelectedListener{
    lateinit var spinner: Spinner
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagina_inicio)
        textView = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinner)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.Carreras,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val text: String = parent?.getItemAtPosition(position).toString()
        textView.text = text
    }
}