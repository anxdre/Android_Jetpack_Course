package com.andresetiawana09.androidjetpack.data.remote.movie

import com.andresetiawana09.androidjetpack.BuildConfig
import com.andresetiawana09.androidjetpack.data.model.Movie
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

@Suppress("UNCHECKED_CAST")
class MovieApiFactory : MovieApiRepository {
    override fun getPopularMovieAsync(): Deferred<Movie> = getDataAsync(
        Endpoint.GET_POPULAR_MOVIE,Movie::class.java
    ) as Deferred<Movie>

    private fun getDataAsync(url: String, type: Class<*>): Deferred<Any> {
        return GlobalScope.async {
            val response = AndroidNetworking.get(url)
                .setPriority(Priority.MEDIUM)
                .build()
                .executeForObject(type)
            response.result
        }
    }
}