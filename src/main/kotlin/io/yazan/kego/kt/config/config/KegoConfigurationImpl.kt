package io.yazan.kego.kt.config.config

import io.yazan.kego.kt.config.components.*

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 2:39 AM
 * Project Name : IntelliJ IDEA
 */
interface KegoConfigurationImpl {

    fun addSplashScreenConfig(config: KegoSplashScreenConfiguration)

    fun addScreenBehaviorItem(name: String, item: KegoScreenBehaviorConfiguration)

    fun addAllScreensBehavior(items: HashMap<String, KegoScreenBehaviorConfiguration>)

    fun addApplicationConfiguration(config: KegoApplicationConfiguration)

    fun addDatabaseConfiguration(config: KegoDatabaseConfiguration)

    fun addImageUrlConfiguration(name: String, config: KegoImageConfiguration)

    fun addAllImagesConfiguration(config: HashMap<String, KegoImageConfiguration>)

    fun addListItemConfiguration(name: String, config: KegoListConfiguration)

    fun addAllListItemsConfiguration(config: HashMap<String, KegoListConfiguration>)

    fun addErrorsConfiguration(config: KegoErrorsConfiguration)

    fun addImagesConfiguration(configImages: KegoImagesUrlConfiguration)

}