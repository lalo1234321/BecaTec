package com.dev.becatec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dev.becatec.databinding.ActivityResultadosBdBinding
import com.dev.becatec.databinding.ActivitySearchResultsBinding

class Search_Results : AppCompatActivity() {
    private lateinit var binding: ActivitySearchResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        val s = extras?.getString("url")?:"sin usuario"
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }



}