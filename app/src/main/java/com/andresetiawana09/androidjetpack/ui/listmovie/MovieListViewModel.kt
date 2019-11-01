package com.andresetiawana09.androidjetpack.ui.listmovie

import androidx.lifecycle.ViewModel
import com.andresetiawana09.androidjetpack.data.local.MovieDataDummy
import com.andresetiawana09.androidjetpack.data.local.MovieDummy

class MovieListViewModel : ViewModel() {
    fun getDummyData():List<MovieDummy>{
        return MovieDataDummy.generateDummyData()
    }
}
