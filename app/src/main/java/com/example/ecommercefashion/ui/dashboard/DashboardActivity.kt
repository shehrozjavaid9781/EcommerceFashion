package com.example.ecommercefashion.ui.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ecommercefashion.databinding.ActivityDashboardBinding
import com.example.ecommercefashion.models.TabData
import com.example.ecommercefashion.ui.dashboard.account.AccountFragment
import com.example.ecommercefashion.ui.dashboard.cart.CartFragment
import com.example.ecommercefashion.ui.dashboard.favourite.FavouriteFragment
import com.example.ecommercefashion.ui.dashboard.home.HomeFragment
import com.example.ecommercefashion.ui.dashboard.shop.ShopFragment
import com.example.ecommercefashion.utils.Constants

class DashboardActivity : AppCompatActivity(), TabListener {

    lateinit var dashboardBinding: ActivityDashboardBinding
    private lateinit var tabAdapter : TabAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dashboardBinding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(dashboardBinding.root)

        initViews()
        setUpViewPager()
        initTabs()
    }

    private fun initTabs() {
        dashboardBinding.tabCustomsRv.layoutManager = GridLayoutManager(this, Constants.getTabsData().size)
        tabAdapter = TabAdapter(this,Constants.getTabsData(),this)
        dashboardBinding.tabCustomsRv.adapter = tabAdapter
    }

    private fun setUpViewPager() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment())
        adapter.addFragment(ShopFragment())
        adapter.addFragment(CartFragment())
        adapter.addFragment(FavouriteFragment())
        adapter.addFragment(AccountFragment())
        dashboardBinding.viewPager.adapter = adapter
    }

    private fun initViews() {
        dashboardBinding.viewPager.offscreenPageLimit = 4
        dashboardBinding.viewPager.setPagingEnabled(false)
    }

    override fun onTab(tabData: TabData, position: Int) {
        for (temp in Constants.getTabsData()){
            temp.tabSelected = false
        }
        tabData.tabSelected = true
        dashboardBinding.viewPager.setCurrentItem(position,false)
        tabAdapter.setData(Constants.getTabsData())
    }
}