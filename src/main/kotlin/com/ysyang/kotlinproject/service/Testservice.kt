package com.ysyang.kotlinproject.service

import org.springframework.stereotype.Service

@Service
class Testservice {
    fun sayhello(name: String): String{
        return "hello $name"
    }
}
