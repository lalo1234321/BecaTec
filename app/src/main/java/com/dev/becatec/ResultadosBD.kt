package com.dev.becatec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.dev.becatec.adapter.BecaAdapter
import com.dev.becatec.bd.BecaCrud
import com.dev.becatec.databinding.ActivityResultadosBdBinding

class ResultadosBD : AppCompatActivity() {

    private lateinit var binding: ActivityResultadosBdBinding
    var crud:BecaCrud? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadosBdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    fun initRecyclerView(){
        crud = BecaCrud(this)
        var becas:ArrayList<Becas> = ArrayList()
        becas = crud!!.getBecas()
        val manager = LinearLayoutManager(this)
        val divider = DividerItemDecoration(this, manager.orientation)

        println("Obteniendo becas")
        binding.recyclerPrueba.layoutManager = LinearLayoutManager(this)
        binding.recyclerPrueba.adapter = BecaAdapter(becas) { beca ->
            onItemSelected(
                beca
            )
        }
        binding.recyclerPrueba.addItemDecoration(divider)
    }

    fun onItemSelected(becas: Becas){
        val intent = Intent(this, Search_Results::class.java)
        intent.putExtra("url", becas.url)
        startActivity(intent)
    }

}