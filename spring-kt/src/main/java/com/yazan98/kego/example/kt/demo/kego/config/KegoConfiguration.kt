package com.yazan98.kego.example.kt.demo.kego.config

import com.yazan98.kego.example.kt.demo.kego.components.*
import java.util.*


/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 2:27 AM
 * Project Name : IntelliJ IDEA
 */
object KegoConfiguration : KegoConfigurationImpl {

    internal var imagesConfiguration: KegoImagesUrlConfiguration? = null
    internal var splashScreenConfiguration: KegoSplashScreenConfiguration? = null
    internal var errorsConfiguration: KegoErrorsConfiguration? = null
    internal var databaseConfiguration: KegoDatabaseConfiguration? = null
    internal var colorableItems: KegoColorableItemsConfiguration? = null
    internal var applicationConfiguration: KegoApplicationConfiguration? = null

    internal val screensOptions: HashMap<String, KegoScreenBehaviorConfiguration> by lazy {
        HashMap<String, KegoScreenBehaviorConfiguration>()
    }

    internal val listsOptions: HashMap<String, KegoListConfiguration> by lazy {
        HashMap<String, KegoListConfiguration>()
    }

    internal val imageItemsConfig: HashMap<String, KegoImageConfiguration> by lazy {
        HashMap<String, KegoImageConfiguration>()
    }

    override fun addSplashScreenConfig(config: KegoSplashScreenConfiguration) {
        this.splashScreenConfiguration = config
    }

    override fun addScreenBehaviorItem(name: String, item: KegoScreenBehaviorConfiguration) {
        this.screensOptions.put(name, item)
    }

    override fun addAllScreensBehavior(items: HashMap<String, KegoScreenBehaviorConfiguration>) {
        this.screensOptions.putAll(items)
    }

    override fun addApplicationConfiguration(config: KegoApplicationConfiguration) {
        this.applicationConfiguration = config
    }

    override fun addDatabaseConfiguration(config: KegoDatabaseConfiguration) {
        this.databaseConfiguration = config
    }

    override fun addImageUrlConfiguration(name: String, config: KegoImageConfiguration) {
        this.imageItemsConfig.put(name, config)
    }

    override fun addAllImagesConfiguration(config: HashMap<String, KegoImageConfiguration>) {
        this.imageItemsConfig.putAll(config)
    }

    override fun addListItemConfiguration(name: String, config: KegoListConfiguration) {
        this.listsOptions.put(name, config)
    }

    override fun addAllListItemsConfiguration(config: HashMap<String, KegoListConfiguration>) {
        this.listsOptions.putAll(config)
    }

    override fun addErrorsConfiguration(config: KegoErrorsConfiguration) {
        this.errorsConfiguration = config
    }

    override fun addImagesConfiguration(configImages: KegoImagesUrlConfiguration) {
        this.imagesConfiguration = configImages
    }

}
