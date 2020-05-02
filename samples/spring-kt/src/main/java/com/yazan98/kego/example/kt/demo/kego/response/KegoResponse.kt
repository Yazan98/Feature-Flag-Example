package com.yazan98.kego.example.kt.demo.kego.response

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