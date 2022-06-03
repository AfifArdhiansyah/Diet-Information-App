package com.example.ditfo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ditfo.Data.SecondData
import com.example.ditfo.databinding.ActivityItemListSecondBinding

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){
    private lateinit var onItemClickListener: OnItemClickListener
    private val listItem = ArrayList<SecondData>()

    interface OnItemClickListener{
        fun onItemClicked(secondData: SecondData)
    }

    fun setOnItemCLickListener(onItemClickListener: OnItemClickListener){
        this.onItemClickListener = onItemClickListener
    }

    fun setList(list: List<SecondData>){
        if (list == null) return
        listItem.clear()
        listItem.addAll(list)
        notifyDataSetChanged()
    }

    inner class SecondViewHolder(private val binding: ActivityItemListSecondBinding):
        RecyclerView.ViewHolder(binding.root) {
            fun bind(secondData: SecondData){
                binding.titleListSecond.text = secondData.title
                binding.imageListSecond.setImageResource(secondData.image)
                itemView.setOnClickListener{
                    onItemClickListener.onItemClicked(listItem[adapterPosition])
                }
                binding.subtitleListScond.text = secondData.subtitle
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val itemBinding = ActivityItemListSecondBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SecondViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        val secondData = listItem[position]
        holder.bind(secondData)
    }

    override fun getItemCount(): Int = listItem.size

}