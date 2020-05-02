package io.yazan.kego.kt.config.components

import io.yazan.kego.kt.config.components.sub.KegoListViewType

/**
 * Name : Yazan98
 * Date : 5/1/2020
 * Time : 8:26 PM
 * Project Name : IntelliJ IDEA
 */

data class KegoListConfiguration(
        val featureId: String,
        val featureType: String,
        val featureName: String,
        val featureKey: String,
        val isFeatureEnabled: Boolean,
        val listViewType: KegoListViewType,
        val globalMargin: Int,
        val isMainImageClickableWithView: Boolean,
        val isPaginationEnabled: Boolean,
        val itemContentOptionsViewType: String,
        val childes: List<Any>?
)
