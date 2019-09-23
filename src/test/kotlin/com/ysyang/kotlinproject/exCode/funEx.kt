package com.ysyang.kotlinproject.exCode

fun sum(a: Int, b: Int): Int {
    var sum = 0
    fun calSum(){
        for(i in a..b){
            sum += i
        }
    }

    calSum()
    return sum
}

fun main(agrs: Array<String>) {
    val result = sum(1, 10)
    println(result)
}


