package io.yazan.kego.kt.config.providers

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 2:27 AM
 * Project Name : IntelliJ IDEA
 */
interface KegoProvider<T> {

    fun getConfigurationResult(): T

}
