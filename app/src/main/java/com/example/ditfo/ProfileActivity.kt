package com.example.ditfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    private lateinit var actionBar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        actionBar = this.supportActionBar!!
        actionBar.title = "Tentang Saya"

        name_profile.text = "NABILA MUTIARA PUTRI"
        image_profile.setImageResource(R.drawable.rara_profile)
        describe_profile.text = "Hai, nama saya Nabila Mutiara Putri, biasa dipanggil Nabila. Saya adalah mahasiswa Fakultas Kedokteran Universitas Nadhatul Ulama Surabaya. Saya menulis informasi diet di aplikasi ini karena saya cukup ahli dalam hal diet. Jika ada pertanyaan atau ingin berdiskusi saya sangat terbuka untuk itu"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}