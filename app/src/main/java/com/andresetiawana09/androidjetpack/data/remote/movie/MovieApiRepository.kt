package com.andresetiawana09.androidjetpack.data.remote.movie

import com.andresetiawana09.androidjetpack.data.model.Movie
import kotlinx.coroutines.Deferred

interface MovieApiRepository {
    fun getPopularMovieAsync():Deferred<Movie>
}