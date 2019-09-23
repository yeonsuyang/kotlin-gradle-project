package com.ysyang.kotlinproject.controller

import com.ysyang.kotlinproject.service.Testservice
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

data class Result(val id:Int, val title: String, val content: String)

@RestController
class HelloController{

    @Autowired
    lateinit var service: Testservice;

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "id",defaultValue = "0") id: Int,
              @RequestParam(value = "title", defaultValue ="defaultTitle") title: String,
              @RequestParam(value = "content", defaultValue ="defaultContent") content: String)
              = Result(id,title,content)

    @GetMapping("/service")
    fun ioc(@RequestParam(value = "name") name : String) = service.sayhello(name)
}
