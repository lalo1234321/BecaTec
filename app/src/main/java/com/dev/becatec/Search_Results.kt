package com.dev.becatec

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dev.becatec.databinding.ActivityResultadosBdBinding
import com.dev.becatec.databinding.ActivitySearchResultsBinding
import kotlinx.android.synthetic.main.activity_search_results.*

class Search_Results : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = intent.extras
        val page = extras?.getString("url")?:"sin url"
        val requisitos = extras?.getString("requisitos")?:"Sin Requisitos"
        val beca_nombre = extras?.getString("name")?:"Beca sin nombre"
        val desc = extras?.getString("desc")?:"Sin descripcion"
        putContent(desc,beca_nombre,requisitos)
        btnVisitSite.setOnClickListener { visitPage(page) }
    }

    fun putContent(desc:String, beca_nombre:String,requisitos:String){
        tvBecaDesc.text = desc
        tvRequisitos.text = requisitos
        tvNombreBeca.text = beca_nombre
    }

    fun visitPage(page:String){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse(page))
        startActivity(intent)
    }



}