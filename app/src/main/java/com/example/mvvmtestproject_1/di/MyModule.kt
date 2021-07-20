package com.example.mvvmtestproject_1.di

import com.example.mvvmtestproject_1.model.DataModel
import com.example.mvvmtestproject_1.model.DataModelImpl
import com.example.mvvmtestproject_1.model.service.KakaoSearchService
import com.example.mvvmtestproject_1.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

var retrofitPart = module {
    single<KakaoSearchService> {
        Retrofit.Builder()
            .baseUrl("https://dapi.kakao.com")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KakaoSearchService::class.java)
    }
}

var modelPart = module {
    factory<DataModel> {
        DataModelImpl(get())
    }
}

var viewModelPart = module {
    viewModel {
        MainViewModel(get())
    }
}
var myDiModule = listOf(retrofitPart, modelPart, viewModelPart)
