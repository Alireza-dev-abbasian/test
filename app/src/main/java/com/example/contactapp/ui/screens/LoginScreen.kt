package com.example.contactapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.contactapp.R
import com.example.contactapp.ui.components.HeadingTextComponent
import com.example.contactapp.ui.components.ImageComponent

@Composable
fun LoginScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            HeadingTextComponent(value = stringResource(id = R.string.hi))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewOfLoginScreen() {
    LoginScreen()
}