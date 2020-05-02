package com.yazan98.kego.example.kt.demo.kego.components

/**
 * Name : Yazan98
 * Date : 5/1/2020
 * Time : 8:41 PM
 * Project Name : IntelliJ IDEA
 */

data class KegoDatabaseConfiguration(
        val featureId: String,
        val featureType: String,
        val featureName: String,
        val featureKey: String,
        val isDatabaseNeedMigration: Boolean,
        val isPrimaryDatabaseEnabled: Boolean,
        val primaryDatabaseType: String,
        val supportedDatabases: List<String>?,
        val migrationFields: List<KegoDatabaseMigrationField>?
)

data class KegoDatabaseMigrationField(
        val key: String,
        val type: String
)
