package com.dev.becatec.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dev.becatec.Becas
import com.dev.becatec.R
import com.bumptech.glide.Glide

class BecaViewHolder(view: View):RecyclerView.ViewHolder(view){

    val institucion=view.findViewById<TextView>(R.id.tvInsititucion)
    val image = view.findViewById<ImageView>(R.id.imvBeca)
    val desc = view.findViewById<TextView>(R.id.tvDesc)

    fun render(becaModel: Becas){
        institucion.text = becaModel.institucion
        desc.text = becaModel.desc
        Glide.with(image.context).load(becaModel.image).into(image)
    }
}