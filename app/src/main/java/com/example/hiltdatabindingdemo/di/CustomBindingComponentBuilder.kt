package com.example.hiltdatabindingdemo.di

import dagger.hilt.DefineComponent

@DefineComponent.Builder
interface CustomBindingComponentBuilder {
    fun build(): CustomBindingComponent
}
