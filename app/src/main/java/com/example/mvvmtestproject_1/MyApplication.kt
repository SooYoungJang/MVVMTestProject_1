package com.example.mvvmtestproject_1

import android.app.Application
import com.example.mvvmtestproject_1.di.myDiModule
import org.koin.android.ext.android.startKoin


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this@MyApplication, myDiModule)
    }
}