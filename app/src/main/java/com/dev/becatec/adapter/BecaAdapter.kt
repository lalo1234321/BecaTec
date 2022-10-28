package com.dev.becatec.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.becatec.Becas
import com.dev.becatec.BecasProvider
import com.dev.becatec.R

class BecaAdapter(private val becaList:List<Becas>) : RecyclerView.Adapter<BecaViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BecaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BecaViewHolder(layoutInflater.inflate(R.layout.item_beca,parent, false))
    }

    override fun onBindViewHolder(holder: BecaViewHolder, position: Int) {
        val item = becaList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return becaList.size
    }

}