package com.example.ecommercefashion.utils

import com.example.ecommercefashion.R
import com.example.ecommercefashion.models.BannerData
import com.example.ecommercefashion.models.ContentBlockData
import com.example.ecommercefashion.models.TabData

class Constants {

    companion object {
        var tabDataArrayList : ArrayList<TabData>? = null
        var contentBlockArrayList : ArrayList<ContentBlockData>? = null

        fun getTabsData() : ArrayList<TabData> {

            if (tabDataArrayList == null){
                tabDataArrayList = ArrayList()

                //Object 1
                val tab1 = TabData()
                tab1.tabId = "1"
                tab1.tabName = "Home"
                tab1.tabImage = R.drawable.home
                tab1.tabSelected = true
                tabDataArrayList!!.add(tab1)

                //Object 2
                val tab2 = TabData()
                tab2.tabId = "2"
                tab2.tabName = "Shop"
                tab2.tabImage = R.drawable.shop
                tabDataArrayList!!.add(tab2)

                //Object 3
                val tab3 = TabData()
                tab3.tabId = "3"
                tab3.tabName = "Cart"
                tab3.tabImage = R.drawable.cart
                tabDataArrayList!!.add(tab3)

                //Object 4
                val tab4 = TabData()
                tab4.tabId = "4"
                tab4.tabName = "Favourite"
                tab4.tabImage = R.drawable.favoutite
                tabDataArrayList!!.add(tab4)

                //Object 5
                val tab5 = TabData()
                tab5.tabId = "5"
                tab5.tabName = "Account"
                tab5.tabImage = R.drawable.account
                tabDataArrayList!!.add(tab5)

            }

            return tabDataArrayList as ArrayList<TabData>
        }

        fun getBlocks() : ArrayList<ContentBlockData> {

            if (contentBlockArrayList == null){

                contentBlockArrayList = ArrayList()

                val blockData = ContentBlockData()
                blockData.blockId = "1"
                blockData.blockName = "Block 1"
                blockData.blockType = 0
                blockData.bannerDataArrayList = ArrayList()

                val bannerData = BannerData()
                bannerData.bannerId = "1"
                bannerData.bannerImage = R.drawable.banner_one
                blockData.bannerDataArrayList.add(bannerData)

                val bannerData2 = BannerData()
                bannerData2.bannerId = "2"
                bannerData2.bannerImage = R.drawable.banner_two
                blockData.bannerDataArrayList.add(bannerData2)

                val bannerData3 = BannerData()
                bannerData3.bannerId = "3"
                bannerData3.bannerImage = R.drawable.banner_three
                blockData.bannerDataArrayList.add(bannerData3)

                contentBlockArrayList!!.add(blockData)

                // Object 2
                val blockData2 = ContentBlockData()
                blockData2.blockId = "2"
                blockData2.blockName = "Block 2"
                blockData2.blockType = 1
                blockData2.bannerDataArrayList = ArrayList()

                val bannerBig = BannerData()
                bannerBig.bannerId = "1"
                bannerBig.bannerImage = R.drawable.banner_big
                blockData2.bannerDataArrayList.add(bannerBig)

                contentBlockArrayList!!.add(blockData2)

            }
            return contentBlockArrayList!!
        }
    }
}