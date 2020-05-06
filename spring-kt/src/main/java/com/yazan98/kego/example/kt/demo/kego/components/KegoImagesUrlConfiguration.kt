package com.yazan98.kego.example.kt.demo.kego.components

/**
 * Name : Yazan98
 * Date : 5/1/2020
 * Time : 8:48 PM
 * Project Name : IntelliJ IDEA
 */

data class KegoImagesUrlConfiguration(
        val featureId: String,
        val featureType: String,
        val featureName: String,
        val featureKey: String,
        val isImagesDividedLinks: Boolean,
        val imagesBaseUrl: List<KegoBaseUrl>?,
        val childes: List<Any>?
)

data class KegoBaseUrl(
        val componentName: String,
        val baseUrl: String
)
