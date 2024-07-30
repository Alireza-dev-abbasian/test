package com.example.contactapp.utils.image

import android.widget.ImageView
import java.io.File

interface ImageLoader {
    fun loadImage(url: String, imageView: ImageView)
    fun loadImage(file: File, imageView: ImageView)
    fun loadImage(resourceId: Int, imageView: ImageView)
}