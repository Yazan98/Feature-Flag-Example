package com.yazan98.kego.example.kt.demo.service.provider

import com.yazan98.kego.example.kt.demo.kego.components.KegoDatabaseConfiguration
import com.yazan98.kego.example.kt.demo.kego.components.KegoDatabaseMigrationField
import com.yazan98.kego.example.kt.demo.kego.providers.KegoDatabaseProvider
import java.util.*

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:38 AM
 * Project Name : IntelliJ IDEA
 */

class DatabaseProvider : KegoDatabaseProvider() {

    override fun getConfigurationResult(): KegoDatabaseConfiguration {
        return KegoDatabaseConfiguration(
                UUID.randomUUID().toString(),
                "Local Database",
                "Database Migration",
                "456",
                true,
                true,
                "Room",
                arrayListOf("Room", "Realm", "SqlLite"),
                arrayListOf(
                        KegoDatabaseMigrationField("id", "String"),
                        KegoDatabaseMigrationField("qty", "Int")
                )
        )
    }

}