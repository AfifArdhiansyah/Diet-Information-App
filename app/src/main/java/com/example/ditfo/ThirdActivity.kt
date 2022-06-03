package com.example.ditfo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.ditfo.Data.SecondData
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_SECOND = "extra_second"
    }
    private lateinit var actionBar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        cl_thrid.setBackgroundColor(Color.parseColor("#C7E78B"))

        actionBar = this.supportActionBar!!
        val intent : SecondData? = intent.getParcelableExtra<SecondData>(EXTRA_SECOND)

        actionBar.title = intent?.head
        title_third.text = intent?.title
        if (intent != null) {
            image_third.setImageResource(intent.image)
        }
        describe_third.text = intent?.describe

        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}