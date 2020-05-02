package com.yazan98.kego.example.kt.demo.controller

import com.yazan98.kego.example.kt.demo.kego.response.KegoDefaultResponseContent
import com.yazan98.kego.example.kt.demo.kego.response.KegoResponse
import com.yazan98.kego.example.kt.demo.service.ConfigService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Name : Yazan98
 * Date : 5/2/2020
 * Time : 3:19 AM
 * Project Name : IntelliJ IDEA
 */

@RestController
@RequestMapping("/configuration")
class ConfigController @Autowired constructor(private val service: ConfigService) {

    @RequestMapping(method = [RequestMethod.GET], path = ["/global"])
    fun getConfig(): KegoResponse {
        return KegoResponse(
                HttpStatus.OK.value(),
                "Success",
                "1.0.0",
                service.getResponse()
        )
    }
}