package io.yazan.kego.kt.config.components

/**
 * Name : Yazan98
 * Date : 5/1/2020
 * Time : 8:52 PM
 * Project Name : IntelliJ IDEA
 */

data class KegoErrorsConfiguration(
        val id: String,
        val featureName: String,
        val isErrorHandlersEnabled: Boolean,
        val isErrorRepeaterEnabled: Boolean,
        val errorsSupported: List<KegoErrorView>,
        val errors: List<KegoError>
)

data class KegoError(
        val errorType: String,
        val errorCode: Int,
        val errorName: String,
        val featureName: String,
        val errorView: KegoErrorView
)

enum class KegoErrorView {
    SHORT_MESSAGE, BOTTOM_MESSAGE, LONG_MESSAGE, DIALOG, SCREEN, OTHER, DISABLED, REPEATER
}
