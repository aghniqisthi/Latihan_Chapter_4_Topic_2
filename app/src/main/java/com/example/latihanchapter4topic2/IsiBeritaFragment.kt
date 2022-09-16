package com.example.latihanchapter4topic2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_isi_berita.*

class IsiBeritaFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_isi_berita, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getData = arguments?.getSerializable("berita") as Berita

        judulIsi.text = getData.title
        tanggalIsi.text = getData.date
        jurnalis.text = getData.writer
        gambarIsi.setImageResource(getData.image)
        isiBerita.text = getData.content
    }
}