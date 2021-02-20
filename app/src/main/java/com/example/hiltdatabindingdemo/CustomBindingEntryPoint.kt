package com.example.hiltdatabindingdemo

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@BindingScoped
@InstallIn(CustomBindingComponent::class)
interface CustomBindingEntryPoint {

    @BindingScoped
    fun getImageBindingAdapter(): ImageBindingAdapter
}
