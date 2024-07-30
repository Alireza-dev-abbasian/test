package com.example.contactapp.viewmodel

import android.net.Uri
import android.widget.ImageView
import androidx.lifecycle.ViewModel
import com.example.contactapp.utils.image.ImageLoader
import dagger.hilt.android.lifecycle.HiltViewModel
import java.io.File
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val imageLoader: ImageLoader
) : ViewModel() {


}