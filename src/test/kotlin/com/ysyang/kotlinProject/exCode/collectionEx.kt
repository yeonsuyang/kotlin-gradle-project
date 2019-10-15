package com.ysyang.kotlinProject.exCode

import java.util.ArrayList

fun main(args: Array<String>) {
    val javaList: ArrayList<String> = ArrayList()

    javaList.add("hello")
    javaList.add("world")

    println("${javaList.get(0)}")



    val immutableList: List<String> = listOf("hello","world")
    println("${immutableList.get(0)}, ${immutableList.get(1)}")

    val mutableList: MutableList<String> = mutableListOf("hello","world")
    mutableList.add("ysyang")
    mutableList.set(1,"yang")
    println("${mutableList.get(0)}, ${mutableList.get(1)}")

    val iterator=immutableList.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }

}

