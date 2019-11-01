package com.andresetiawana09.androidjetpack.data.remote.tvshow

import com.andresetiawana09.androidjetpack.data.model.Movie
import kotlinx.coroutines.Deferred

interface TvShowApiRepository {
    fun getPopularMovie(): Deferred<Movie>
}