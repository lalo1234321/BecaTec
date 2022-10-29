package com.dev.becatec.adapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.dev.becatec.Becas
import com.dev.becatec.R
import com.bumptech.glide.Glide
import com.dev.becatec.Search_Results
import com.dev.becatec.databinding.ItemBecaBinding

class BecaViewHolder(view: View):RecyclerView.ViewHolder(view){

    val binding = ItemBecaBinding.bind(view)


    fun render(becaModel: Becas, onClickListener: (Becas)->Unit){
        binding.tvInsititucion.text = becaModel.institucion
        binding.tvDesc.text = becaModel.desc
        Glide.with(binding.imvBeca.context).load(becaModel.image).into(binding.imvBeca)
        itemView.setOnClickListener{onClickListener(becaModel)}
    }
}