package com.example.materialdesignapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesignapp.databinding.ActivityMainBinding
import com.example.materialdesignapp.framework.ScreenSlidePagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setAdapterFragment()
    }

    fun setAdapterFragment(){
        val lAdapter = ScreenSlidePagerAdapter(supportFragmentManager, lifecycle)
        lAdapter.addFragment(ComponenteFragment())
        lAdapter.addFragment(CardComponenteFragment())
        lAdapter.addFragment(ChipComponenteFragment())
        mBinding.viewPagerMain.adapter = lAdapter
    }

    fun goToPage(){
        mBinding.viewPagerMain.setCurrentItem(mBinding.viewPagerMain.currentItem +1)
    }
}