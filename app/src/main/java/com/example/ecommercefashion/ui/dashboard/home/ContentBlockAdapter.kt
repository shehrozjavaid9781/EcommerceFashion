package com.example.ecommercefashion.ui.dashboard.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommercefashion.databinding.ItemBannerHolderBinding
import com.example.ecommercefashion.models.ContentBlockData

class ContentBlockAdapter(val context : Context?, private val contentBlockArrayList: ArrayList<ContentBlockData>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val bannerBinding = ItemBannerHolderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return when (viewType) {
            ContentBlockData.BANNER_TYPE -> {
                BannerTableHolder(bannerBinding,context)
            }
            ContentBlockData.BANNER_BIG_HEIGHT -> {
                BannerTableHolder(bannerBinding,context)
            }
            else -> BannerTableHolder(bannerBinding, context)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val blockData = contentBlockArrayList[position]
        when (blockData.blockType) {
            ContentBlockData.BANNER_TYPE -> {
                (holder as BannerTableHolder).bind(blockData,position)
            }
            ContentBlockData.BANNER_BIG_HEIGHT -> {
                (holder as BannerTableHolder).bind(blockData,position)
            }
        }
    }

    override fun getItemCount(): Int {
        return contentBlockArrayList.size
    }

    override fun getItemViewType(position: Int): Int {
        return contentBlockArrayList[position].blockType
    }
}