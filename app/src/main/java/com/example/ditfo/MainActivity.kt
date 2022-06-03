package com.example.ditfo

import android.content.Intent
import android.graphics.Color
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.ditfo.Data.Data
import com.example.ditfo.databinding.ActivityMainBinding
import com.example.ditfo.databinding.ActivitySecondBinding
import com.example.ditfo.databinding.CardItemBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.card_item.*
import kotlinx.android.synthetic.main.swipe_up.*

class MainActivity : AppCompatActivity() {

    //actionbar
    private lateinit var actionBar: ActionBar
    private lateinit var myModelList: ArrayList<MyModel>
    private lateinit var myAdapter: ViewPagerAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar = this.supportActionBar!!

        binding = ActivityMainBinding.inflate(layoutInflater)

        myAdapter = ViewPagerAdapter()
        binding.viewPager.apply {
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            adapter = myAdapter
            (getChildAt(0) as RecyclerView).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        }
        myAdapter.setList(Data.getHome())

        setContentView(binding.root)


        //add page change listener
       view_pager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
           override fun onPageScrolled(
               position: Int,
               positionOffset: Float,
               positionOffsetPixels: Int
           ) {
               super.onPageScrolled(position, positionOffset, positionOffsetPixels)
               head_home.text = Data.getHome()[position].title
               val color = Data.getHome()[position].color
               cl_home.setBackgroundColor(Color.parseColor(color))

               button_home.setOnClickListener {
                   val intent = Intent(this@MainActivity, SecondActivity::class.java)
                   intent.putExtra("IntegerData", Data.getHome()[position].data)
                   startActivity(intent)
               }
           }
       })

//        button_profile.setOnClickListener {
//            val intent = Intent(this@MainActivity, ProfileActivity::class.java)
//            startActivity(intent)
//        }

        describe_home.text = "Ditfo atau Diet Information merupakan sebuah aplikasi yang berisi informasi mengenai tips dan trick untuk diet dan menurunkan berat badan secara sehat dan aman tanpa menyiksa diri. Mulai dari tips memulai diet, meal plan sampai program gerakan olahraga yang bisa menurunkan berat badan"
    }
}