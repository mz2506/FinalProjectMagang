package com.example.finalproject.model

class Buku {
    private var foto:Int = 0
    private var judul:String = ""
    private var deskripsi:String = ""
    private var penulis:String=""
    private var kategori:String=""
    private var tahun:String=""

    constructor(foto:Int, judul:String, deskripsi:String, penulis:String, kategori:String, tahun:String){
        this.foto = foto
        this.judul  = judul
        this.deskripsi = deskripsi
        this.penulis = penulis
        this.kategori = kategori
        this.tahun = tahun
    }

    fun getFoto():Int{
        return foto
    }
    fun getJudul():String{
        return judul
    }
    fun getDeskripsi():String{
        return deskripsi
    }
    fun getPenulis():String{
        return penulis
    }
    fun getKategori():String{
        return kategori
    }
    fun getTahun():String{
        return tahun
    }
}