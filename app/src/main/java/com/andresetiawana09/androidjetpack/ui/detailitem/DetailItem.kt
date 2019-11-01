package com.andresetiawana09.androidjetpack.ui.detailitem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.andresetiawana09.androidjetpack.R
import com.andresetiawana09.androidjetpack.data.local.MovieDummy
import com.andresetiawana09.androidjetpack.data.local.TvShowDummy
import com.andresetiawana09.androidjetpack.utils.getImage
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.detail_item_fragment.*

class DetailItem : Fragment() {
    private lateinit var viewModel: DetailItemViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detail_item_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailItemViewModel::class.java)
        val movieData = arguments?.getParcelable<MovieDummy>("MOVIE")
        val tvData = arguments?.getParcelable<TvShowDummy>("TV_SHOW")

        if (movieData != null) {
            getImage(requireContext(), movieData.posterPath, iv_poster_detail)
            tv_title_detail.text = movieData.title
            tv_desc_detail.text = movieData.desc
        } else if (tvData != null) {
            getImage(requireContext(), tvData.posterPath, iv_poster_detail)
            tv_title_detail.text = tvData.title
            tv_desc_detail.text = tvData.desc
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        activity?.bt_main?.visibility = View.GONE
    }
}
