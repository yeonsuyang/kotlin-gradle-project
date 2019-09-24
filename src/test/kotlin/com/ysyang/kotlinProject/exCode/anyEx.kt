package com.ysyang.kotlinProject.exCode

fun getLength(obj: Any): Int {
    if (obj is String){
        return obj.length
    }
    return 0
}

fun main(args: Array<String>){
    println(getLength("Hello"))
    println(getLength(10))
}
