package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalproject.adapter.BukuAdapter
import com.example.finalproject.databinding.ActivityMainBinding
import com.example.finalproject.model.Buku

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    lateinit var bukuAdapter: BukuAdapter

    val layoutmanager = LinearLayoutManager(this)
    val addBukuList : MutableList<Buku> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }
    fun initView(){
        binding.rvData.layoutManager = layoutmanager
        bukuAdapter = BukuAdapter(this)
        binding.rvData.adapter = bukuAdapter

        addBukuList.add(
            Buku(
                foto = R.drawable.dalam_waktu_dekat,
                judul="DALAM WAKTU DEKAT",
                deskripsi ="Tulisan saya dalam buku Dalam Waktu Dekat ini, mulanya hanya catatan-ca" +
                        "tatan singkat, ringan, dan sederhana yang “beruntung” dimuat di media massa" +
                        ", daring maupun luring. Sebagiannya lagi bahkan disampaikan pada unggahan " +
                        "di media sosial seperti Facebook dan grup WhatsApp. Sehingga, apa yang saya" +
                        " guratkan dalam buku ini mungkin lebih tepat disebut kumpulan “kegelisihan" +
                        " tafsîrî” saya. Bila “buku” diandaikan mesti “paradigmatik”, teoretik dan " +
                        "“ilmiah”, yang pembaca temukan bisa jadi tidaklah demikian. Buku saya ini" +
                        " masih parsial-subjektif.",
                penulis = "Penulis: Budiman Sulaeman",
                tahun = "Tahun Terbit: 2020",
                kategori = "Kategori: Nonfiksi"))

        addBukuList.add(
            Buku(
                foto = R.drawable.pelarian,
                judul = "PELARIAN",
                deskripsi = "Sejumlah hal menarik dapat ditemui pada cerita-cerita S.M. Noor ini." +
                        " Antara lain titik tolaknya pada peran dan dilema anak-anak muda dalam" +
                        " menempatkan dirinya di tengah masyarakat. Kegagapan anak-anak muda yang" +
                        " mencoba memposisikan dirinya dan mengambil peran dalam persoalan-persoalan" +
                        " besar maupun kecil.",
                penulis = "Penulis: S.M. Noor",
                tahun = "Tahun Terbit: 2022",
                kategori = "Kategori: Fiksi"))

        addBukuList.add(
            Buku(
                foto = R.drawable.siasat_menikmati_kesemenjanaan,
                judul = "SIASAT MENIKMATI KESEMENJANAAN",
                deskripsi = "Esai yang baik adalah yang mengambil posisi tengah—bentuknya menyerupai" +
                        " fiksi, ada tokoh, ada setting, kalau perlu ada plot, dan isinya merupakan" +
                        " sesuatu yang bersifat faktual atau sungguh-sungguh ada. Jika mengamati" +
                        " dengan kriteria tersebut, esai yang terkumpul pada buku ini nyaris mendekati" +
                        " bentuk penulisan esai yang sempurna. Penulis dalam hampir semua esainya" +
                        " telah menetapkan sebuah latar: kota Parepare sebagai kota tua yang lama" +
                        " digelutinya. Di dalamnya kita bersua dengan tokoh-tokoh (tokoh di sini " +
                        "tidak harus manusia) dan, sebagai pembaca dapat kita menarik sebuah jalan" +
                        " cerita setelah tuntas membacanya.",
                penulis = "Penulis: Ilham Mustamin",
                tahun = "Tahun Terbit: 2021",
                kategori = "Kategori: Nonfiksi"))

        bukuAdapter.setListDataBuku(addBukuList)
    }
}