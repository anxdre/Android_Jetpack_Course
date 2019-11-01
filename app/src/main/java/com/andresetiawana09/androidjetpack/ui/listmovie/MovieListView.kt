package com.andresetiawana09.androidjetpack.ui.listmovie

import com.andresetiawana09.androidjetpack.data.local.MovieDummy

interface MovieListView {
    fun showError()
    fun attachData(mData: List<MovieDummy>)
}