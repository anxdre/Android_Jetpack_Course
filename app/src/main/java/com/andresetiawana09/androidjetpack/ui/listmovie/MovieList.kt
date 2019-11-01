package com.andresetiawana09.androidjetpack.ui.listmovie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.andresetiawana09.androidjetpack.R
import com.andresetiawana09.androidjetpack.data.local.MovieDummy
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.movie_list_fragment.*

class MovieList : Fragment(), MovieListView {

    private lateinit var viewModel: MovieListViewModel
    var movieData = listOf<MovieDummy>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.movie_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            viewModel = ViewModelProviders.of(this).get(MovieListViewModel::class.java)
            movieData = viewModel.getDummyData()
            attachData(movieData)
        }
    }

    override fun showError() {
        Toast.makeText(context, "Something Error", Toast.LENGTH_SHORT).show()
    }

    override fun attachData(mData: List<MovieDummy>) {
        rv_movie.layoutManager = LinearLayoutManager(context)
        rv_movie.adapter = MovieAdapter(mData, requireContext()) {
            findNavController().navigate(R.id.action_movie_fragment_to_detail_fragment, bundleOf(Pair("MOVIE",it)))
        }
    }
}
