package com.example.finalproject.adapter

import android.content.Context
import android.content.Intent
import android.graphics.ColorSpace.Model
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.DetailBukuActivity
import com.example.finalproject.R
import com.example.finalproject.model.Buku

class BukuAdapter(val context: Context):RecyclerView.Adapter<BukuAdapter.BukuViewHolder>() {
    private val buku : MutableList<Buku> = mutableListOf()

    override fun getItemCount(): Int {
        return buku.size
    }

    override fun onBindViewHolder(holder: BukuAdapter.BukuViewHolder, position: Int) {
        holder.bindModel(buku[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
        return BukuViewHolder(LayoutInflater.from(context).
        inflate(R.layout.list_buku, parent, false))
    }

    inner class BukuViewHolder(item: View):RecyclerView.ViewHolder(item){
        val imgFoto:ImageView = item.findViewById(R.id.img_buku)
        val textjudul:TextView = item.findViewById(R.id.judul_buku)
        val textpenulis:TextView = item.findViewById(R.id.penulis_buku)
        val textkategori:TextView = item.findViewById(R.id.kategori_buku)
        val texttahun:TextView = item.findViewById(R.id.tahun_buku)

        val cardViewData:CardView = item.findViewById(R.id.vc_buku)

        fun bindModel (book:Buku){
            imgFoto.setImageResource(book.getFoto())
            textjudul.text = book.getJudul()
            textpenulis.text = book.getPenulis()
            textkategori.text = book.getKategori()
            texttahun.text = book.getTahun()


            cardViewData.setOnClickListener{
                val i = Intent(context,DetailBukuActivity::class.java).apply {
                    putExtra("gambar",book.getFoto())
                    putExtra("Judul",book.getJudul())
                    putExtra("penulis",book.getPenulis())
                    putExtra("tahun",book.getTahun())
                    putExtra("kategori", book.getKategori())
                    putExtra("Deskripsi",book.getDeskripsi())
                }
                context.startActivity(i)
            }
        }

    }

    fun setListDataBuku(data:List<Buku>){
        buku.clear()
        buku.addAll(data)
        notifyDataSetChanged()
    }
}