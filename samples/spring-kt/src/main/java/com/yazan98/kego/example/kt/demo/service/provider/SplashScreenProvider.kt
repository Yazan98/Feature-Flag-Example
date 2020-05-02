package com.yazan98.kego.example.kt.demo.service.provider

import com.yazan98.kego.example.kt.demo.kego.components.KegoLoadingViewType
import com.yazan98.kego.example.kt.demo.kego.components.KegoSplashScreenConfiguration
import com.yazan98.kego.example.kt.demo.kego.providers.KegoSplashScreenProvider
import java.util.*

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:30 AM
 * Project Name : IntelliJ IDEA
 */

class SplashScreenProvider : KegoSplashScreenProvider() {

    companion object {
        const val FEATURE_TYPE = "Splash Screen"
        const val FEATURE_NAME = "Launcher Screen"
        const val FEATURE_KEY = "123"
        const val LOADING_POSITION = "Center Screen Content"
    }

    override fun getConfigurationResult(): KegoSplashScreenConfiguration {
        return KegoSplashScreenConfiguration(
                UUID.randomUUID().toString(),
                FEATURE_TYPE,
                FEATURE_NAME,
                FEATURE_KEY,
                false,
                true,
                LOADING_POSITION,
                KegoLoadingViewType.ANIMATED_CIRCLE,
                true,
                false,
                true,
                true,
                true
        )
    }

}