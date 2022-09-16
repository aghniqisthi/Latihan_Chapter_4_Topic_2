package com.example.latihanchapter4topic2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.latihanchapter4topic2.databinding.ItemBeritaBinding

class BeritaAdapter(var listBerita:ArrayList<Berita>) : RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    var onClick:((Berita) -> Unit)? = null

    class ViewHolder(val binding:ItemBeritaBinding):RecyclerView.ViewHolder(binding.root) {
        fun databind(itemData:Berita){
            binding.berita = itemData
            binding.cardBerita.setOnClickListener{
                var bundle = Bundle()
                bundle.putSerializable("berita", itemData)
                Navigation.findNavController(itemView).navigate(R.id.action_beritaFragment_to_isiBeritaFragment, bundle)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemBeritaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        holder.databind(listBerita[position])
    }

    override fun getItemCount(): Int = listBerita.size

}