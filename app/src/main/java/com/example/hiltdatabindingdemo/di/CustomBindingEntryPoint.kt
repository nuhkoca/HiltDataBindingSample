package com.example.hiltdatabindingdemo.di

import com.example.hiltdatabindingdemo.binding.ImageBindingAdapter
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@BindingScoped
@InstallIn(CustomBindingComponent::class)
interface CustomBindingEntryPoint {

    @BindingScoped
    fun getImageBindingAdapter(): ImageBindingAdapter
}
