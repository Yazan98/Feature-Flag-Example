package com.yazan98.kego.example.kt.demo.service.provider

import com.yazan98.kego.example.kt.demo.kego.components.KegoListConfiguration
import com.yazan98.kego.example.kt.demo.kego.components.KegoScreenBehaviorConfiguration
import com.yazan98.kego.example.kt.demo.kego.components.sub.KegoLinearListViewType
import com.yazan98.kego.example.kt.demo.kego.components.sub.KegoListOrientation
import com.yazan98.kego.example.kt.demo.kego.providers.KegoScreenBehaviorProvider
import java.util.*

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:54 AM
 * Project Name : IntelliJ IDEA
 */

class ScreensBehaviorProvider : KegoScreenBehaviorProvider() {

    init {
        addItem("Home Screen", KegoScreenBehaviorConfiguration(
                UUID.randomUUID().toString(),
                "Home Screen - Categories",
                "Categories",
                "156",
                true,
                false,
                false,
                true,
                KegoListConfiguration(
                        UUID.randomUUID().toString(),
                        "Home Screen - Categories",
                        "Categories",
                        "156",
                        true,
                        KegoLinearListViewType(true, KegoListOrientation.LINEAR_HORIZONTAL),
                        10,
                        true,
                        true,
                        "BOTTOM_VIEW",
                        null
                ),
                true,
                "FadeIn",
                "FadeOut",
                true,
                null
        ))

        addItem("Home Screen", KegoScreenBehaviorConfiguration(
                UUID.randomUUID().toString(),
                "Home Screen - Categories",
                "Categories",
                "156",
                true,
                false,
                false,
                true,
                KegoListConfiguration(
                        UUID.randomUUID().toString(),
                        "Home Screen - Categories",
                        "Categories",
                        "156",
                        true,
                        KegoLinearListViewType(true, KegoListOrientation.LINEAR_HORIZONTAL),
                        10,
                        true,
                        true,
                        "BOTTOM_VIEW",
                        null
                ),
                true,
                "FadeIn",
                "FadeOut",
                true,
                null
        ))

        addItem("Home Screen", KegoScreenBehaviorConfiguration(
                UUID.randomUUID().toString(),
                "Home Screen - Categories",
                "Categories",
                "156",
                true,
                false,
                false,
                true,
                KegoListConfiguration(
                        UUID.randomUUID().toString(),
                        "Home Screen - Categories",
                        "Categories",
                        "156",
                        true,
                        KegoLinearListViewType(true, KegoListOrientation.LINEAR_HORIZONTAL),
                        10,
                        true,
                        true,
                        "BOTTOM_VIEW",
                        null
                ),
                true,
                "FadeIn",
                "FadeOut",
                true,
                null
        ))

        addItem("Home Screen", KegoScreenBehaviorConfiguration(
                UUID.randomUUID().toString(),
                "Home Screen - Categories",
                "Categories",
                "156",
                true,
                false,
                false,
                true,
                KegoListConfiguration(
                        UUID.randomUUID().toString(),
                        "Home Screen - Categories",
                        "Categories",
                        "156",
                        true,
                        KegoLinearListViewType(true, KegoListOrientation.LINEAR_HORIZONTAL),
                        10,
                        true,
                        true,
                        "BOTTOM_VIEW",
                        null
                ),
                true,
                "FadeIn",
                "FadeOut",
                true,
                null
        ))
    }
}