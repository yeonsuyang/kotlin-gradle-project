package com.ysyang.kotlinProject.service

import org.springframework.stereotype.Service

@Service
class TestService {
    fun sayHello(name: String): String{
        return "hello $name"
    }
}
