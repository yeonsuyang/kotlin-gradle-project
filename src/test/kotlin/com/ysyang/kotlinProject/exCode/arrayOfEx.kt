package com.ysyang.kotlinProject.exCode

fun main(args: Array<String>){

    /*
    var array = arrayOf(1,"ys.yang",true)
    array[0] = 10
    array[2] = "world"
    println("${array[0]},${array[1]},${array[2]}")
    println("size : ${array.size}, ${array.get(2)}")

    var arrayInt = arrayOf<Int>(10,20,30)
    println("${arrayInt[0]},${arrayInt[1]},${arrayInt[2]}")

    var arrayInt3 = intArrayOf(10,20,30) */


    var array3 = Array(3, {i -> i*10})
    println("${array3[0]},${array3[1]},${array3[2]}")

}
