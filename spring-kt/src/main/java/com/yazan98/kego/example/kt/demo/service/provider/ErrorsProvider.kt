package com.yazan98.kego.example.kt.demo.service.provider

import com.yazan98.kego.example.kt.demo.kego.components.KegoError
import com.yazan98.kego.example.kt.demo.kego.components.KegoErrorView
import com.yazan98.kego.example.kt.demo.kego.components.KegoErrorsConfiguration
import com.yazan98.kego.example.kt.demo.kego.providers.KegoErrorProvider
import java.util.*

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:34 AM
 * Project Name : IntelliJ IDEA
 */

class ErrorsProvider : KegoErrorProvider() {

    override fun getConfigurationResult(): KegoErrorsConfiguration {
        return KegoErrorsConfiguration(
                UUID.randomUUID().toString(),
                "Application Global Errors",
                true,
                false,
                arrayListOf(
                        KegoErrorView.BOTTOM_MESSAGE,
                        KegoErrorView.SCREEN,
                        KegoErrorView.SHORT_MESSAGE
                ),
                getErrors()
                )
    }

    private fun getErrors(): List<KegoError> {
        return arrayListOf(
                KegoError(
                    "NotFound",
                        404,
                        "Data Not Found",
                        "Categories",
                        KegoErrorView.BOTTOM_MESSAGE
                ),
                KegoError(
                        "UnAuth",
                        401,
                        "Blocked Users",
                        "Users View",
                        KegoErrorView.BOTTOM_MESSAGE
                )
        )
    }

}