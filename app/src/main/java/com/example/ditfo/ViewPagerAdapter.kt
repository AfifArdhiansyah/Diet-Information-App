package com.example.ditfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ditfo.Data.SecondData
import com.example.ditfo.databinding.CardItemBinding

class ViewPagerAdapter: RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {
//    private lateinit var onItemClickListener: OnItemClickListener
    private val listItem = ArrayList<MyModel>()

//    interface OnItemClickListener{
//        fun onItemClicked(myModel: MyModel)
//    }

//    fun setOnItemCLickListener(onItemClickListener: OnItemClickListener){
//        this.onItemClickListener = onItemClickListener
//    }

    fun setList(list: List<MyModel>){
        if (list == null) return
        listItem.clear()
        listItem.addAll(list)
        notifyDataSetChanged()
    }

    inner class Pager2ViewHolder(private val binding: CardItemBinding):
        RecyclerView.ViewHolder(binding.root) {
            fun bind(myModel: MyModel){
                binding.imageHome.setImageResource(myModel.image)
//                itemView.setOnClickListener{
//                    onItemClickListener.onItemClicked(listItem[adapterPosition])
//                }
            }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.Pager2ViewHolder {
        val itemBinding = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Pager2ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
        val myModel = listItem[position]
        holder.bind(myModel)
    }

    override fun getItemCount(): Int = listItem.size

}

