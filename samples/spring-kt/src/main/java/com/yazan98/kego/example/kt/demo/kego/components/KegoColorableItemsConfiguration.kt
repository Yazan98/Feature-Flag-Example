package com.yazan98.kego.example.kt.demo.kego.components

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 2:17 AM
 * Project Name : IntelliJ IDEA
 */

data class KegoColorableItemsConfiguration(
        val featureId: String,
        val featureType: String,
        val featureName: String,
        val featureKey: String,
        val supportedColors: List<String>?,
        val supportedItems: List<String>?,
        val colorsItems: List<KegoColoredItem>
)

data class KegoColoredItem(
        val itemName: String,
        val featureName: String,
        val colorCode: String,
        val isBackgroundColor: Boolean,
        val isOutlinedColor: Boolean
)