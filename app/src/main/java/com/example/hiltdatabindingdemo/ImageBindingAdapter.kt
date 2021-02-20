package com.example.hiltdatabindingdemo

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import javax.inject.Inject

class ImageBindingAdapter @Inject constructor() {

    @BindingAdapter(value = ["app:src"])
    fun ImageView.bindImage(url: String?) {
        Picasso.get().load(url).into(this)
    }
}
