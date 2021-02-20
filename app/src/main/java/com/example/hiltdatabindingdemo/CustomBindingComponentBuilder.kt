package com.example.hiltdatabindingdemo

import dagger.hilt.DefineComponent

@DefineComponent.Builder
interface CustomBindingComponentBuilder {
    fun build(): CustomBindingComponent
}