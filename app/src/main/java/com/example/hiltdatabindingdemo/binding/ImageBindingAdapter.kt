package com.example.hiltdatabindingdemo.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import javax.inject.Inject

class ImageBindingAdapter @Inject constructor() {

    @BindingAdapter(value = ["app:src"])
    fun ImageView.bindImage(url: String?) {
        load(url) {
            crossfade(true)
        }
    }
}
