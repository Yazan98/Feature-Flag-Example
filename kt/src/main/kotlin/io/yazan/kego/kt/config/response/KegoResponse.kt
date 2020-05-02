package io.yazan.kego.kt.config.response

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 2:46 AM
 * Project Name : IntelliJ IDEA
 */
data class KegoResponse(
        val code: Int,
        val status: String,
        val version: String,
        val data: KegoResponseContent
)