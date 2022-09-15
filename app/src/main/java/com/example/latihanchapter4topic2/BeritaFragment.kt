package com.example.latihanchapter4topic2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanchapter4topic2.databinding.ActivityMainBinding
import com.example.latihanchapter4topic2.databinding.FragmentBeritaBinding

class BeritaFragment : Fragment() {

    lateinit var adapterBerita: BeritaAdapter
    lateinit var binding: FragmentBeritaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentBeritaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listBerita = arrayListOf(
            Berita("title 1", "date 1", R.drawable.berita_twt, "content 1", "writer 1"),
            Berita("title 2", "date 2", R.drawable.berita_twt, "content 2", "writer 2"),
            Berita("title 3", "date 3", R.drawable.berita_twt, "content 3", "writer 3"),
            Berita("title 4", "date 4", R.drawable.berita_twt, "content 4", "writer 4"),
            Berita("title 5", "date 5", R.drawable.berita_twt, "content 5", "writer 5")
        )

        binding.rvBerita.adapter = BeritaAdapter(listBerita)
        binding.rvBerita.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

    }
}