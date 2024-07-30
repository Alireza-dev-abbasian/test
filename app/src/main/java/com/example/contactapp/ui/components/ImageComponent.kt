package com.example.contactapp.ui.components

import android.widget.ImageView
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.contactapp.MainActivity
import com.example.contactapp.utils.image.ImageLoader
import dagger.hilt.android.AndroidEntryPoint
import java.io.File

@Composable
fun ImageComponent(
    url: String? = null,
    file: File? = null,
    resourceId: Int? = null,
    width: Int = 100,
    height: Int = 100
) {
    val context = LocalContext.current

    // Inject ImageLoader
//    val imageLoader: ImageLoader = (context as MainActivity).imageLoader

//    Box(
//        modifier = Modifier
//            .width(width.dp)
//            .height(height.dp)
//    ) {
//        AndroidView(factory = { ctx ->
//            ImageView(ctx).apply {
//                layoutParams = android.view.ViewGroup.LayoutParams(
//                    android.view.ViewGroup.LayoutParams.MATCH_PARENT,
//                    android.view.ViewGroup.LayoutParams.MATCH_PARENT
//                )
//
//                when {
//                    url != null -> imageLoader.loadImage(url, this)
//                    file != null -> imageLoader.loadImage(file, this)
//                    resourceId != null -> imageLoader.loadImage(resourceId, this)
//                }
//            }
//        })
//    }
}