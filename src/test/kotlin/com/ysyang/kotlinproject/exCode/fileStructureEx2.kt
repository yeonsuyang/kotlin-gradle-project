package com.ysyang.kotlinproject.exCode

var sum = 0

fun calSum() {
    for(i in 1..10){
        sum += i
    }
}

fun main(args : Array<String>) {
    calSum()
    println(sum)
}

