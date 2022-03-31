package com.example.ecommercefashion.ui.dashboard.home.BannerRv

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommercefashion.databinding.ItemBannersBinding
import com.example.ecommercefashion.models.BannerData

class BannerRvAdapter(val context: Context?,val height : Int, val bannerDataArrayList: ArrayList<BannerData>) :
    RecyclerView.Adapter<BannerRvHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerRvHolder {
        val itemBanner = ItemBannersBinding.inflate(LayoutInflater.from(parent.context),
            parent,false)
        return BannerRvHolder(itemBanner,context)
    }

    override fun onBindViewHolder(holder: BannerRvHolder, position: Int) {
        holder.bind(height,bannerDataArrayList[position],position)
    }

    override fun getItemCount(): Int {
        return bannerDataArrayList.size
    }
}