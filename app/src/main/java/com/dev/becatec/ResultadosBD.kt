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
import kotlinx.android.synthetic.main.activity_resultados_bd.*

class ResultadosBD ( /*var text1:String, var text2:String*/) : AppCompatActivity() {
    private lateinit var binding: ActivityResultadosBdBinding
    var crud:BecaCrud? = null

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadosBdBinding.inflate(layoutInflater)
        setContentView(binding.root)
       val filtros=intent.extras
       val text1 = filtros?.getString("ingenieria")
       val text2 = filtros?.getString("beca")
        initRecyclerView(text1,text2)
    }
   /*fun passParameter(t1:String,t2:String){
        val bcrd= Intent(this, BecaCrud().getParameters()::class.java)
        intent.putExtra("ing",t1)
        intent.putExtra("bec",t2)
        startActivity(bcrd)
    }*/

    fun initRecyclerView(txt1:String?, txt2:String?){
        crud = BecaCrud(this)
        //textView11.text=txt1.toString()
       // textView15.text=txt2.toString()
        //println(textView11.text.toString()+" _________________ "+textView11.text)
        crud?.getParameters(txt1,txt2)
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
        intent.putExtra("requisitos",becas.requisitos)
        intent.putExtra("desc", becas.desc)
        intent.putExtra("name",becas.beca_nombre)
        startActivity(intent)
    }

}