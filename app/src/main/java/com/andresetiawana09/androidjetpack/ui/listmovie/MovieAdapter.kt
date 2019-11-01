package com.andresetiawana09.androidjetpack.ui.listmovie

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andresetiawana09.androidjetpack.R
import com.andresetiawana09.androidjetpack.data.local.MovieDummy
import com.andresetiawana09.androidjetpack.utils.getImage
import kotlinx.android.synthetic.main.item_holder_main.view.*

class MovieAdapter(
    private val movieList: List<MovieDummy>,
    private val context: Context,
    private val listener: (MovieDummy) -> Unit
) : RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
        MovieViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_holder_main, parent, false)
        )

    override fun getItemCount(): Int = movieList.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) =
        holder.bindItem(context, movieList[position], listener)
}

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bindItem(context: Context, item: MovieDummy, listener: (MovieDummy) -> Unit) {
        itemView.tv_item_main.text = item.title
        getImage(context, item.posterPath, itemView.iv_item_main)
        itemView.setOnClickListener {
            listener(item)
        }

    }

}