package com.yazan98.kego.example.kt.demo.kego.components

/**
 * Name : Yazan98
 * Date : 5/1/2020
 * Time : 8:35 PM
 * Project Name : IntelliJ IDEA
 */

data class KegoImageConfiguration(
        val featureId: String,
        val featureType: String,
        val featureName: String,
        val featureKey: String,
        val isImageClickableForView: Boolean,
        val imageLoaderLibrary: String,
        val isImageCircle: Boolean,
        val isImageHasBoarder: Boolean,
        val aspectRatio: Float,
        val imageChildesConfig: List<Any>?
)
