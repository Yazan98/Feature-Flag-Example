package com.yazan98.kego.example.kt.demo.service.provider

import com.yazan98.kego.example.kt.demo.kego.components.KegoBaseUrl
import com.yazan98.kego.example.kt.demo.kego.components.KegoImagesUrlConfiguration
import com.yazan98.kego.example.kt.demo.kego.providers.KegoBaseUrlProvider
import java.util.*

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:52 AM
 * Project Name : IntelliJ IDEA
 */

class ImagesBaseUrlProvider : KegoBaseUrlProvider() {

    override fun getConfigurationResult(): KegoImagesUrlConfiguration {
        return KegoImagesUrlConfiguration(
                UUID.randomUUID().toString(),
                "Base Url",
                "Images Base Url",
                "486",
                true,
                arrayListOf(
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage"),
                        KegoBaseUrl("Categories", "https://www.firebase.com/storage")
                ),
                null
        )
    }
}