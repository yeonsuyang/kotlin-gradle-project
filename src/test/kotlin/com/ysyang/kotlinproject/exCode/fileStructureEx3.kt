package com.ysyang.kotlinproject.exCode

import java.util.*

var sum2 = 0

fun calSum2() {
    for(i in 1..10){
        sum2 += i
    }
}


class fileStructureEx3 {
    val name = "ys"
    fun sayHello() {
        val date = Date()
        println("date :" + date)
        println("Hello !!" + name)
    }
}

fun main(args : Array<String>) {
    calSum2()
    println(sum2)
    println(sum)
}


