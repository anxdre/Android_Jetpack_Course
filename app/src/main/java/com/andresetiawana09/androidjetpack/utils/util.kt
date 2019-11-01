package com.andresetiawana09.androidjetpack.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun getImage(context: Context,url:String,imageView:ImageView){
    Glide.with(context)
        .load("https://image.tmdb.org/t/p/w185$url")
        .fitCenter()
        .into(imageView)

}