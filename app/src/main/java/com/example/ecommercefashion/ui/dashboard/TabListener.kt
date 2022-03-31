package com.example.ecommercefashion.ui.dashboard

import com.example.ecommercefashion.models.TabData

interface TabListener {
    fun onTab(tabData : TabData, position: Int)
}