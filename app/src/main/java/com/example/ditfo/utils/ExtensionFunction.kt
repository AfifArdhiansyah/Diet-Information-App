package com.example.ditfo.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object ExtensionFunction {
    fun ImageView.setPictureHome(url: String){
        Glide.with(this.context)
            .load(url)
            .apply(
                RequestOptions().override(800, 800)
            )
            .into(this)
    }

    fun ImageView.setPictureRV(url: String?){
        Glide.with(this.context)
            .load(url)
            .apply(
                RequestOptions().override(400, 400)
            )
            .into(this)
    }

    fun ImageView.setPictureThird(url: String?){
        Glide.with(this.context)
            .load(url)
            .apply(
                RequestOptions().override(1000, 1000)
            )
            .into(this)
    }
}