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
        var desc = findViewById<EditText>(R.id.etDesc)
        var bAgregar = findViewById<Button>(R.id.bInsertar)

        crud = BecaCrud(this)
        bAgregar.setOnClickListener{
            print("comiendo")
            println(id.text.toString().toInt())
           /* crud?.newBeca(
                Becas(
                    id.text.toString().toInt(),
                    institucion.text.toString(),
                    desc.text.toString(),
                    "https://www.nj.com/resizer/mg42jsVYwvbHKUUFQzpw6gyKmBg=/1280x0/smart/advancelocal-adapter-image-uploads.s3.amazonaws.com/image.nj.com/home/njo-media/width2048/img/somerset_impact/photo/sm0212petjpg-7a377c1c93f64d37.jpg",
                    "active",
                    "www.ITTol.com"
                )
            )*/
            startActivity(Intent(this, ResultadosBD::class.java))
        }
    }
}