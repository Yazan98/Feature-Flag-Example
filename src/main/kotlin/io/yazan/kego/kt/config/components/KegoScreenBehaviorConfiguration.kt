package io.yazan.kego.kt.config.components

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 1:07 AM
 * Project Name : IntelliJ IDEA
 */

data class KegoScreenBehaviorConfiguration(
        val featureId: String,
        val featureType: String,
        val featureName: String,
        val featureKey: String,
        val isScreenHasNotifications: Boolean,
        val isToolbarEnabled: Boolean,
        val isToolbarTabsEnabled: Boolean,
        val isBottomNavEnabled: Boolean,
        val screenLists: KegoListConfiguration?,
        val isTopRefreshEnabled: Boolean,
        val screenEnterAnimation: String,
        val screenExitAnimation: Boolean,
        val isPrimaryItemsAnimated: Boolean,
        val childes: List<Any>?
)
