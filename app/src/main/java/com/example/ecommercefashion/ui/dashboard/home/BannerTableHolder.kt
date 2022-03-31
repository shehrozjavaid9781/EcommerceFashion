package com.example.ecommercefashion.ui.dashboard.home

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommercefashion.databinding.ItemBannerHolderBinding
import com.example.ecommercefashion.models.ContentBlockData
import com.example.ecommercefashion.ui.dashboard.home.BannerRv.BannerRvAdapter

class BannerTableHolder(private val binding: ItemBannerHolderBinding,private val context: Context?) :
    RecyclerView.ViewHolder(binding.root) {

    val pagerSnapHelper = PagerSnapHelper()
    var height : Int = 0

    fun bind(blockData: ContentBlockData, position: Int) {

        if (blockData.blockType == 1){
            height = context!!.resources.getDimensionPixelSize(com.intuit.sdp.R.dimen._260sdp)
        } else{
            height = context!!.resources.getDimensionPixelSize(com.intuit.sdp.R.dimen._140sdp)
        }

        binding.bannerRv.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,
            false)
        val bannerRvAdapter = BannerRvAdapter(context,height,blockData.bannerDataArrayList)
        binding.bannerRv.adapter = bannerRvAdapter
        pagerSnapHelper.attachToRecyclerView(binding.bannerRv)
    }
}