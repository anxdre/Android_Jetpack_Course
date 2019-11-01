package com.andresetiawana09.androidjetpack.ui.listtvshow

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
import com.andresetiawana09.androidjetpack.data.local.TvShowDummy
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tv_show_list_fragment.*

class TvShowList : Fragment(), TvShowListView {

    private lateinit var viewModel: TvShowListViewModel
    var tvData = listOf<TvShowDummy>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tv_show_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TvShowListViewModel::class.java)
        tvData = viewModel.getDummyData()
        attachData(tvData)
    }

    override fun showError() {
        Toast.makeText(context, "Something Error", Toast.LENGTH_SHORT).show()
    }

    override fun attachData(mData: List<TvShowDummy>) {
        rv_tv_show.layoutManager = LinearLayoutManager(context)
        rv_tv_show.adapter = TvShowAdapter(mData, requireContext()) {
            findNavController().navigate(
                R.id.action_tv_fragment_to_detail_fragment,
                bundleOf(Pair("TV_SHOW", it))
            )
        }
    }
}
