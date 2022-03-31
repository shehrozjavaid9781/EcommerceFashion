package com.example.ecommercefashion.ui.dashboard

import android.content.Context
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommercefashion.R
import com.example.ecommercefashion.databinding.ItemTabsBinding
import com.example.ecommercefashion.models.TabData

class TabViewHolder(private val binding: ItemTabsBinding,private val context: Context,private val listener: TabListener)
    : RecyclerView.ViewHolder(binding.root) {

    fun bind(tabData: TabData, position: Int) {

        binding.tabSelectIV.setImageResource(tabData.tabImage)
        binding.tabSelectTV.text = tabData.tabName

        if (tabData.tabSelected){
            binding.tabSelectIV.setColorFilter(ContextCompat.getColor(context,R.color.red))
            binding.tabSelectTV.setTextColor(ContextCompat.getColor(context,R.color.red))
        } else {
            binding.tabSelectIV.setColorFilter(ContextCompat.getColor(context,R.color.black))
            binding.tabSelectTV.setTextColor(ContextCompat.getColor(context,R.color.black))
        }

        if (position == 2){
            binding.cartCountTv.visibility = View.VISIBLE
        } else{
            binding.cartCountTv.visibility = View.GONE
        }

        binding.root.setOnClickListener {
            listener.onTab(tabData,position)
        }
    }
}