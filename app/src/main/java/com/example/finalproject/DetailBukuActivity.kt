package com.example.finalproject

import android.R
import android.graphics.drawable.Icon
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.databinding.ActivityDetailBukuBinding


class DetailBukuActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBukuBinding
    var b : Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBukuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()

        //untuk memunculkan action bar
    supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //untuk memberikan scroll bar pada textView
    val tv = findViewById<View>(com.example.finalproject.R.id.desc_detail) as TextView
    tv.movementMethod = ScrollingMovementMethod()
        }
    fun initView(){
        b = intent.extras

        b?.let { binding.imgDetail.setImageResource(it.getInt("gambar")) }
        binding.judulDetail.text = b?.getString("Judul")
        binding.penulisDetail.text =  b?.getString("penulis")
        binding.tahunDetail.text =  b?.getString("tahun")
        binding.descDetail.text = b?.getString("Deskripsi")
        binding.kategoriDetail.text = b?.getString("kategori")
   }

}