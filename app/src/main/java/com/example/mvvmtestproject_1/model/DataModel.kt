package com.example.mvvmtestproject_1.model

import com.example.mvvmtestproject_1.model.enum.KakaoSearchSortEnum
import com.example.mvvmtestproject_1.model.response.ImageSearchResponse
import io.reactivex.Single

interface DataModel {
    fun getData(query:String, sort: KakaoSearchSortEnum, page:Int, size:Int): Single<ImageSearchResponse>
}