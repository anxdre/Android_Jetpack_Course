package com.andresetiawana09.androidjetpack.ui.listtvshow

import com.andresetiawana09.androidjetpack.data.local.TvShowDummy

interface TvShowListView {
    fun showError()
    fun attachData(mData: List<TvShowDummy>)
}