package com.example.contactapp.di.module

import com.example.contactapp.utils.image.CoilImageLoader
import com.example.contactapp.utils.image.ImageLoader
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class ImageLoaderModule {

    @Binds
    @Singleton
    abstract fun bindImageLoader(coilImageLoader: CoilImageLoader): ImageLoader
}