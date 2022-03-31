package com.example.ecommercefashion.ui.dashboard

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommercefashion.databinding.ItemTabsBinding
import com.example.ecommercefashion.models.TabData

class TabAdapter(var context : Context,var tabDataArrayList: ArrayList<TabData>,var listener : TabListener)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val tabsBinding = ItemTabsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TabViewHolder(tabsBinding,context,listener)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val tabData = tabDataArrayList.get(position)
        (holder as TabViewHolder).bind(tabData,position)
    }

    override fun getItemCount(): Int {
        return tabDataArrayList.size
    }

    fun setData(tabsData: ArrayList<TabData>) {
        tabDataArrayList = tabsData
        notifyDataSetChanged()
    }
}