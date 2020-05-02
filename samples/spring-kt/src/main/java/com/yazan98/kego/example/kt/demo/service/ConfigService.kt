package com.yazan98.kego.example.kt.demo.service

import com.yazan98.kego.example.kt.demo.kego.config.KegoConfiguration
import com.yazan98.kego.example.kt.demo.kego.response.KegoDefaultResponseContent
import com.yazan98.kego.example.kt.demo.kego.response.KegoResponseContent
import com.yazan98.kego.example.kt.demo.service.provider.*
import org.springframework.stereotype.Service

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:21 AM
 * Project Name : IntelliJ IDEA
 */

@Service
open class ConfigService {

    private fun initConfig() {
        KegoConfiguration.let {
            it.addApplicationConfiguration(ApplicationProvider().getConfigurationResult())
            it.addSplashScreenConfig(SplashScreenProvider().getConfigurationResult())
            it.addErrorsConfiguration(ErrorsProvider().getConfigurationResult())
            it.addDatabaseConfiguration(DatabaseProvider().getConfigurationResult())
            it.colorableItems = ColorableItemsProvider().getConfigurationResult()
            it.addImagesConfiguration(ImagesBaseUrlProvider().getConfigurationResult())
            it.addAllScreensBehavior(ScreensBehaviorProvider().getConfigurationResult())
        }
    }

    fun getResponse(): KegoResponseContent {
        initConfig()
        return KegoDefaultResponseContent()
    }

}
