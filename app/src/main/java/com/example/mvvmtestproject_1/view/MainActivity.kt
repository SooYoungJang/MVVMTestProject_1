package com.example.mvvmtestproject_1.view

import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.mvvmtestproject_1.MainSearchRecyclerViewAdapter
import com.example.mvvmtestproject_1.R
import com.example.mvvmtestproject_1.base.BaseKotlinActivity
import com.example.mvvmtestproject_1.databinding.ActivityMainBinding
import com.example.mvvmtestproject_1.viewmodel.MainViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseKotlinActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutResourceId: Int = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()

    //    private val mainSearchRecyclerViewAdapter: MainSearchRecyclerViewAdapter by inject()
    override fun initStartView() {
        Log.d("tttt","########")
    }

    override fun initDataBinding() {
        Log.d("tttt","#####11111###")
    }
//    override fun initStartView() {
//        viewDataBinding.mainActivitySearchRecyclerView.run {
//            adapter = mainSearchRecyclerViewAdapter
//            layoutManager = StaggeredGridLayoutManager(3, 1).apply {
//                gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
//                orientation = StaggeredGridLayoutManager.VERTICAL
//            }
//            setHasFixedSize(true)
//        }
//    }
//
//    override fun initDataBinding() {
//        viewModel.imageSearchResponseLiveData.observe(this, Observer {
//            it.documents.forEach {document ->
//                mainSearchRecyclerViewAdapter.addImageItem(document.image_url, document.doc_url)
//            }
//            mainSearchRecyclerViewAdapter.notifyDataSetChanged()
//        })
//    }

    override fun initAfterBinding() {

        viewDataBinding.mainActivitySearchButton.setOnClickListener {
            viewModel.getImageSearch(viewDataBinding.mainActivitySearchTextView.text.toString(), 1, 80)
        }
    }
}