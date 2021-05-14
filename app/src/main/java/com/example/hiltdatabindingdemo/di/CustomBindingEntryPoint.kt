package com.example.hiltdatabindingdemo.di

import androidx.databinding.DataBindingComponent
import com.example.hiltdatabindingdemo.binding.ImageBindingAdapter
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@BindingScoped
@InstallIn(CustomBindingComponent::class)
interface CustomBindingEntryPoint : DataBindingComponent {

    @BindingScoped
    override fun getImageBindingAdapter(): ImageBindingAdapter
}
