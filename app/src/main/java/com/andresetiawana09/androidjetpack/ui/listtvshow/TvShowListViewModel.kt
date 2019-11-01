package com.andresetiawana09.androidjetpack.ui.listtvshow

import androidx.lifecycle.ViewModel
import com.andresetiawana09.androidjetpack.data.local.TvDataDummy
import com.andresetiawana09.androidjetpack.data.local.TvShowDummy

class TvShowListViewModel : ViewModel() {
    fun getDummyData(): List<TvShowDummy> {
        return TvDataDummy.generateDummyData()
    }
}
