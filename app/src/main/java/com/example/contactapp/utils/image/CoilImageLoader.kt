package com.example.contactapp.utils.image

import android.widget.ImageView
import coil.load
import java.io.File
import javax.inject.Inject

class CoilImageLoader @Inject constructor() : ImageLoader {

    override fun loadImage(url: String, imageView: ImageView) {
        imageView.load(url)
    }

    override fun loadImage(file: File, imageView: ImageView) {
        imageView.load(file)
    }

    override fun loadImage(resourceId: Int, imageView: ImageView) {
        imageView.load(resourceId)
    }
}