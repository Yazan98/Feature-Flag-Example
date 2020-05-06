package com.yazan98.kego.example.kt.demo.service.provider

import com.yazan98.kego.example.kt.demo.kego.components.KegoColorableItemsConfiguration
import com.yazan98.kego.example.kt.demo.kego.components.KegoColoredItem
import com.yazan98.kego.example.kt.demo.kego.providers.KegoColorableItemsProvider
import java.util.*

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:40 AM
 * Project Name : IntelliJ IDEA
 */

class ColorableItemsProvider : KegoColorableItemsProvider() {

    override fun getConfigurationResult(): KegoColorableItemsConfiguration {
        return KegoColorableItemsConfiguration(
                UUID.randomUUID().toString(),
                "Items Can Be Colored",
                "Custom Colors",
                "789",
                arrayListOf("#000", "#fff", "#ff5d85", "#FFOT456G"),
                arrayListOf("Categories", "Users", "Posts", "Posts_Profile_Image"),
                colorsItems = arrayListOf(
                        KegoColoredItem(
                                "Post Image",
                                "Posts",
                                "#000",
                                false,
                                true
                        ),
                        KegoColoredItem(
                                "Post Image",
                                "Posts",
                                "#000",
                                false,
                                true
                        ),
                        KegoColoredItem(
                                "Post Image",
                                "Posts",
                                "#000",
                                false,
                                true
                        ),
                        KegoColoredItem(
                                "Post Image",
                                "Posts",
                                "#000",
                                false,
                                true
                        ),
                        KegoColoredItem(
                                "Post Image",
                                "Posts",
                                "#000",
                                false,
                                true
                        )
                )
        )
    }

}