package com.yazan98.kego.example.kt.demo.kego.response

import com.yazan98.kego.example.kt.demo.kego.components.*
import com.yazan98.kego.example.kt.demo.kego.config.KegoConfiguration
import java.util.*


/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 2:46 AM
 * Project Name : IntelliJ IDEA
 */

data class KegoDefaultResponseContent(
        var imagesConfiguration: KegoImagesUrlConfiguration? = KegoConfiguration.imagesConfiguration,
        var splashScreenConfiguration: KegoSplashScreenConfiguration? = KegoConfiguration.splashScreenConfiguration,
        var errorsConfiguration: KegoErrorsConfiguration? = KegoConfiguration.errorsConfiguration,
        var databaseConfiguration: KegoDatabaseConfiguration? = KegoConfiguration.databaseConfiguration,
        var colorableItems: KegoColorableItemsConfiguration? = KegoConfiguration.colorableItems,
        var applicationConfiguration: KegoApplicationConfiguration? = KegoConfiguration.applicationConfiguration,
        var screensOptions: HashMap<String, KegoScreenBehaviorConfiguration> = KegoConfiguration.screensOptions,
        var listsOptions: HashMap<String, KegoListConfiguration> = KegoConfiguration.listsOptions,
        var imageItemsConfig: HashMap<String, KegoImageConfiguration> = KegoConfiguration.imageItemsConfig
) : KegoResponseContent
