package com.example.ditfo

import android.content.Intent
import android.content.Intent.getIntent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ditfo.Data.Data
import com.example.ditfo.Data.SecondData
import com.example.ditfo.ThirdActivity.Companion.EXTRA_SECOND
import com.example.ditfo.databinding.ActivitySecondBinding
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

//    private lateinit var mIntent: Intent
    private lateinit var binding : ActivitySecondBinding
    private lateinit var viewAdapter: SecondAdapter
    private lateinit var actionBar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        actionBar = this.supportActionBar!!

        var dataSecond = intent.getIntExtra("IntegerData", 0)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        viewAdapter = SecondAdapter()
        binding.rvSecond.apply {
            layoutManager= LinearLayoutManager(this@SecondActivity)
            adapter = viewAdapter
            overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        }

        if (dataSecond == 0){
            viewAdapter.setList(Data.getOlahraga())
        }
        else if(dataSecond == 1){
            viewAdapter.setList(Data.getMakanan())
        }
        else if(dataSecond == 2){
            viewAdapter.setList(Data.getMealPlan())
        }
        else if(dataSecond == 3){
            viewAdapter.setList(Data.getResep())
        }

        setContentView(binding.root)

        if (dataSecond == 0){
            cl_second.setBackgroundColor(Color.parseColor(Data.getHome()[dataSecond].color))
            actionBar.title = "Olahraga"
        }
        else if(dataSecond == 1){
            cl_second.setBackgroundColor(Color.parseColor(Data.getHome()[dataSecond].color))
            actionBar.title = "Makanan"
        }
        else if(dataSecond == 2){
            cl_second.setBackgroundColor(Color.parseColor(Data.getHome()[dataSecond].color))
            actionBar.title = "Meal Plan"
        }
        else if (dataSecond == 3){
            cl_second.setBackgroundColor(Color.parseColor(Data.getHome()[dataSecond].color))
            actionBar.title = "Resep Menu Diet"
        }

        actionBar.setDisplayHomeAsUpEnabled(true)

        sendDataToDetail()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun sendDataToDetail(){
        viewAdapter.setOnItemCLickListener(object : SecondAdapter.OnItemClickListener{
            override fun onItemClicked(secondData: SecondData) {
                val secondParcel = SecondData(
                    secondData.head,
                    secondData.title,
                    secondData.image,
                    secondData.subtitle,
                    secondData.describe
                )
                val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
                intent.putExtra(EXTRA_SECOND, secondParcel)
                startActivity(intent)
            }
        })
    }
}