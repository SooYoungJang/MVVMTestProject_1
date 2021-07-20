package com.example.mvvmtestproject_1.model

import com.example.mvvmtestproject_1.model.enum.KakaoSearchSortEnum
import com.example.mvvmtestproject_1.model.response.ImageSearchResponse
import com.example.mvvmtestproject_1.model.service.KakaoSearchService
import io.reactivex.Single

class DataModelImpl(private val service: KakaoSearchService):DataModel{

    private val KAKAO_APP_KEY = "a9369b694ff825711fbd6e76630b703d"

    override fun getData(query:String, sort: KakaoSearchSortEnum, page:Int, size:Int): Single<ImageSearchResponse> {
        return service.searchImage(auth = "KakaoAK $KAKAO_APP_KEY", query = query, sort = sort.sort, page = page, size = size)
    }
}