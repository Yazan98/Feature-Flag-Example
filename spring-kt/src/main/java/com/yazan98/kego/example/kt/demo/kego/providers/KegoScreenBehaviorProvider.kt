package com.yazan98.kego.example.kt.demo.kego.providers

import com.yazan98.kego.example.kt.demo.kego.components.KegoScreenBehaviorConfiguration
import java.util.*


/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 2:29 AM
 * Project Name : IntelliJ IDEA
 */

abstract class KegoScreenBehaviorProvider : KegoProvider<HashMap<String, KegoScreenBehaviorConfiguration>> {

    private val items: HashMap<String, KegoScreenBehaviorConfiguration> by lazy {
        HashMap<String, KegoScreenBehaviorConfiguration>()
    }

    protected fun addItem(name: String, item: KegoScreenBehaviorConfiguration) {
        this.items.put(name, item)
    }

    override fun getConfigurationResult(): HashMap<String, KegoScreenBehaviorConfiguration> {
        return items
    }

}
