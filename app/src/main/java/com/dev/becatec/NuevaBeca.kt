package com.dev.becatec

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.dev.becatec.bd.BecaCrud
import kotlinx.android.synthetic.main.activity_insertar_beca.*

class NuevaBeca:AppCompatActivity() {
    var crud:BecaCrud? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertar_beca)
        var id = findViewById<EditText>(R.id.etId)
        var institucion = findViewById<EditText>(R.id.etInstitucion)
        var bAgregar = findViewById<Button>(R.id.bInsertar)

        crud = BecaCrud(this)
        bAgregar.setOnClickListener{
            print("comiendo")
            println(id.text.toString().toInt())
            crud?.newBeca(
                Becas(
                    id.text.toString().toInt(),
                    institucion.text.toString(),
                    "Beca Manutencion",
                    "https://rinacional.tecnm.mx/retrieve/c0721389-bb57-49fd-ad75-9be56bbed922",
                    "active",
                    "www.ITTol.com"
                )
            )
            startActivity(Intent(this, ResultadosBD::class.java))
        }
    }
}