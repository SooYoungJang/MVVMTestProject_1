package com.example.mvvmtestproject_1.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BaseKotlinViewModel : ViewModel(){
    /**
     * RxJava의 observing 을 위한 부분,
     * addDisposable을 이용하여 추가하기만 하면 된다.
     */

    private val compositeDisposable = CompositeDisposable()

    fun addDisposable(disposable: Disposable) : Unit {
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}