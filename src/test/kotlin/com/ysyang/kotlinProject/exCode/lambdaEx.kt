package com.ysyang.kotlinProject.exCode

fun main(agrs: Array<String>) {
    var listInts = listOf(1,2,3,4)
    //filter
    listInts.filter { it % 2 == 0 }
    //출력[2,4]


   // var listInts = listOf(1,2,3,4)
    listInts.map { it * it }
    //출력[1,4,9,16]
}


