package com.example.ecommercefashion.models

class ContentBlockData {

    companion object {
        var BANNER_TYPE = 0
        var BANNER_BIG_HEIGHT = 1
    }

    var blockId = ""
    var blockName = ""
    var blockType = 0
    var bannerDataArrayList : ArrayList<BannerData> = ArrayList()

}