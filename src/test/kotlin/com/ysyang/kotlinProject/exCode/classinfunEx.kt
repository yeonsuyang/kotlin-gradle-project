package com.ysyang.kotlinProject.exCode

fun superFun(){
    val superData = "Hello"
    fun subFun1(){
        println("subFun1() .. superData : ${superData}")
    }

    fun subFun(a: Int, b:Int): Int{
        subFun1()
        return a+b
    }

    class subClass{
        fun classFun(){
            println("classFun() .. superData : ${superData}")
        }
    }

    subFun1()
    subClass().classFun()

    val funVal1 = {x1 : Int ->
        println("HelloWorld")
        x1 * 10
    }

    val funVal2 = ::subFun1

    funVal1(10)
    funVal2()
}
