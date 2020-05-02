package io.yazan.kego.kt.config.response

import io.yazan.kego.kt.config.components.*
import io.yazan.kego.kt.config.config.KegoConfiguration

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
