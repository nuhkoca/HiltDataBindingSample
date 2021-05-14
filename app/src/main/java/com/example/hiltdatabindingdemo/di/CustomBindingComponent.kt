package com.example.hiltdatabindingdemo.di

import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent

@BindingScoped
@DefineComponent(parent = SingletonComponent::class)
interface CustomBindingComponent
