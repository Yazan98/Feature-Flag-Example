package io.yazan.kego.kt.config.components.sub

/**
 * Name : Yazan98
 * Date : 5/1/2020
 * Time : 8:27 PM
 * Project Name : IntelliJ IDEA
 */

interface KegoListViewType

data class KegoGridListViewType(
        val isGridLayout: Boolean,
        val rowItemsNumber: Int,
        val orientation: KegoListOrientation
): KegoListViewType

data class KegoLinearListViewType(
        val isLinearLayout: Boolean,
        val orientation: KegoListOrientation
): KegoListViewType