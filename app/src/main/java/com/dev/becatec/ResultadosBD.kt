package com.dev.becatec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dev.becatec.adapter.BecaAdapter

class ResultadosBD : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerPrueba)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BecaAdapter(BecasProvider.becaList)
    }
}