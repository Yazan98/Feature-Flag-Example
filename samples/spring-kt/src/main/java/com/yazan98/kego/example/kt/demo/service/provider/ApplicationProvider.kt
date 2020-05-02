package com.yazan98.kego.example.kt.demo.service.provider

import com.yazan98.kego.example.kt.demo.kego.components.KegoApplicationConfiguration
import com.yazan98.kego.example.kt.demo.kego.components.KegoNotificationsType
import com.yazan98.kego.example.kt.demo.kego.components.KegoProfileView
import com.yazan98.kego.example.kt.demo.kego.components.KegoScreensAnimation
import com.yazan98.kego.example.kt.demo.kego.providers.KegoApplicationConfigurationProvider
import java.util.*

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:24 AM
 * Project Name : IntelliJ IDEA
 */
class ApplicationProvider: KegoApplicationConfigurationProvider() {

    companion object {
        const val FEATURE_NAME = "Application General Config"
        const val FEATURE_TYPE = "Global Configuration"
        const val FEATURE_KEY = "123"
        const val APP_VERSION = "1.0.0"
    }

    override fun getConfigurationResult(): KegoApplicationConfiguration {
        return KegoApplicationConfiguration(
                UUID.randomUUID().toString(),
                FEATURE_TYPE,
                FEATURE_NAME,
                FEATURE_KEY,
                APP_VERSION,
                false,
                arrayListOf("Light", "Dark", "Colorable"),
                KegoScreensAnimation("FadeIn", "FadeOut"),
                true,
                false,
                true,
                true,
                true,
                arrayListOf("FREE", "PRO", "FEATURED"),
                arrayListOf("VISA", "PAY_PAL", "MASTER", "GOOGLE_PLAY", "APPLE_PAY"),
                KegoProfileView.BOTTOM_VIEW,
                arrayListOf(KegoNotificationsType.NORMAL, KegoNotificationsType.LARGE_IMAGE, KegoNotificationsType.LARGE_IMAGE),
                null,
                arrayListOf("GOOGLE", "FACEBOOK", "EMAIL", "PHONE_NUMBER")
        )
    }

}