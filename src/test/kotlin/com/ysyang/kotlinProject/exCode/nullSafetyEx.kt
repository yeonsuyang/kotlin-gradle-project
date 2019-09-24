package com.ysyang.kotlinProject.exCode

var nullableData : String? = null

fun main(args: Array<String>){
    nullableData = "hello"
    println(parseInt("2"))

}

fun parseInt(str: String): Int?{
    return str.toIntOrNull()
}
