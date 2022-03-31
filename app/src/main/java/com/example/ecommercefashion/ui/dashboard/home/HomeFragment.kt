package com.example.ecommercefashion.ui.dashboard.home

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommercefashion.databinding.FragmentHomeBinding
import com.example.ecommercefashion.utils.Constants

class HomeFragment : Fragment() {

    lateinit var homeBinding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        homeBinding = FragmentHomeBinding.inflate(layoutInflater)

        initViews()
        initContentBlocks()

        return homeBinding.root
    }

    private fun initViews() {
        homeBinding.textView.ellipsize = TextUtils.TruncateAt.MARQUEE
        homeBinding.textView.isSingleLine = true
        homeBinding.textView.marqueeRepeatLimit = -1
        homeBinding.textView.isSelected = true
    }

    private fun initContentBlocks() {
        homeBinding.contentBlockRv.layoutManager = LinearLayoutManager(activity,
            LinearLayoutManager.VERTICAL,false)
        val blockAdapter = ContentBlockAdapter(activity,Constants.getBlocks())
        homeBinding.contentBlockRv.adapter = blockAdapter
    }
}