package com.yazan98.kego.example.kt.demo.kego.components

/**
 * Name : Yazan98
 * Date : 5/1/2020
 * Time : 8:43 PM
 * Project Name : IntelliJ IDEA
 */

data class KegoApplicationConfiguration(
        val featureId: String,
        val featureType: String,
        val featureName: String,
        val featureKey: String,
        val applicationVersion: String,
        val shouldShowNewFeatures: Boolean,
        val supportedThemes: List<String>?,
        val applicationScreensAnimation: KegoScreensAnimation?,
        val shouldOverridePrimaryScreenAnimation: Boolean,
        val isCustomScreensLoadingEnabled: Boolean,
        val isOnlinePaymentEnabled: Boolean,
        val isLocalDatabaseEnabled: Boolean,
        val isSpecialSectionRandomListEnabled: Boolean,
        val appSubscriptions: List<String>?,
        val paymentMethods: List<String>?,
        val profileViewType: KegoProfileView?,
        val supportedNotificationsTypes: List<KegoNotificationsType>?,
        val globalChildes: List<Any>?,
        val supportedRegisterMethods: List<String>?
)

enum class KegoProfileView {
    NORMAL, DIALOG, DRAWER, BOTTOM_VIEW, SCREEN, SEGMENT, CUSTOM
}

data class KegoScreensAnimation(
        val enterAnimation: String,
        val exitAnimation: String
)


enum class KegoNotificationsType {
    NORMAL, IMAGE, CUSTOM, LARGE_IMAGE, LINK
}