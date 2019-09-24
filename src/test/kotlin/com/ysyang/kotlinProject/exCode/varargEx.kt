package com.ysyang.kotlinProject.exCode

fun <T> varargsFun(a1: Int, vararg array:T){
    for( a in array){
        println(a)
    }
}

fun main(args: Array<String>){
    varargsFun(10,"Hello","world")
    varargsFun(4,3 ,5,'c',"wrd",false)
}

