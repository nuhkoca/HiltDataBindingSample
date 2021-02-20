package com.example.hiltdatabindingdemo

import androidx.databinding.DataBindingComponent
import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent

@BindingScoped
@DefineComponent(parent = SingletonComponent::class)
interface CustomBindingComponent : DataBindingComponent