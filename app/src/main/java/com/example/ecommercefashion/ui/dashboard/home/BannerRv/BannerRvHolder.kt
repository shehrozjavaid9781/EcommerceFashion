package com.example.ecommercefashion.ui.dashboard.home.BannerRv

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommercefashion.databinding.ItemBannersBinding
import com.example.ecommercefashion.models.BannerData

class BannerRvHolder(private val binding: ItemBannersBinding, val context: Context?) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(height: Int, bannerData: BannerData, position: Int) {

        val params : ConstraintLayout.LayoutParams = binding.imageView2.layoutParams as ConstraintLayout.LayoutParams
        params.height = height
        binding.imageView2.layoutParams = params

        binding.imageView2.setImageResource(bannerData.bannerImage)
    }


}