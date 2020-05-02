package com.yazan98.kego.example.kt.demo.kego.components

/**
 * Name : Yazan98
 * Date : 5/1/2020
 * Time : 8:38 PM
 * Project Name : IntelliJ IDEA
 */

data class KegoSplashScreenConfiguration(
        val featureId: String,
        val featureType: String,
        val featureName: String,
        val featureKey: String,
        val isAnimatedLogoEnabled: Boolean,
        val isLogoCentered: Boolean,
        val loadingViewPosition: String,
        val loadingViewType: KegoLoadingViewType,
        val isCachingEnabled: Boolean,
        val isBlockedUserEnabled: Boolean,
        val isAuthenticationAppRequired: Boolean,
        val isFirebaseMessagesEnabled: Boolean,
        val isCustomMessagesProviderEnabled: Boolean
)

enum class KegoLoadingViewType {
    CIRCLE, HORIZONTAL, ANIMATED_CIRCLE, ANIMATED_HORIZONTAL, ANIMATION_LOADING
}
