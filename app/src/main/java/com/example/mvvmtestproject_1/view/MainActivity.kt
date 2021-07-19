package com.example.mvvmtestproject_1.view

import com.example.mvvmtestproject_1.R
import com.example.mvvmtestproject_1.base.BaseKotlinActivity
import com.example.mvvmtestproject_1.databinding.ActivityMainBinding
import com.example.mvvmtestproject_1.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseKotlinActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResourceId: Int = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    override fun initStartView() {
        TODO("Not yet implemented")
    }

    override fun initDataBinding() {
        TODO("Not yet implemented")
    }

    override fun initAfterBinding() {
        TODO("Not yet implemented")
    }
}