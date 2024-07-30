package com.example.contactapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.contactapp.app.ContactApp
import com.example.contactapp.ui.screens.LoginScreen
import com.example.contactapp.ui.theme.ContactAppTheme
import com.example.contactapp.utils.image.ImageLoader
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

//    @Inject
//    lateinit var imageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
//            ContactAppTheme {
//                LoginScreen()
//            }
        }
    }
}