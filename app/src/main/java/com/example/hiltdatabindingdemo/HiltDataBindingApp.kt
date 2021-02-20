package com.example.hiltdatabindingdemo

import android.app.Application
import androidx.databinding.DataBindingUtil
import com.example.hiltdatabindingdemo.di.CustomBindingComponentBuilder
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import javax.inject.Provider

@HiltAndroidApp
class HiltDataBindingApp : Application() {

    @Inject
    lateinit var bindingComponentProvider: Provider<CustomBindingComponentBuilder>

    override fun onCreate() {
        super.onCreate()

        DataBindingUtil.setDefaultComponent(bindingComponentProvider.get().build())
    }
}
