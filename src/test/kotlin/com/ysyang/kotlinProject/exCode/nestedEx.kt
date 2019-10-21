package com.ysyang.kotlinProject.exCode

class Outer{
    private var no:Int = 10
    fun outerFun() {
        println("outerFun()..!")
    }


    inner class Nested1{
        val name: String = "ys"
        fun myFun(){
            println("Nested1 Fun..!")
            no = 20
            outerFun()
        }
    }

    /*class Nested2{
        val name: String = "yeonsu"
        fun myFun(){
            println("Nested1 Fun..!")
            no = 20
            outerFun()
        }
    }*/

    fun createNested1(): Nested1{
        return Nested1()
    }
}

fun main(args: Array<String>) {

    val obj3:Outer.Nested1 = Outer().Nested1()
    val obj1:Outer.Nested1 = Outer().createNested1()
    println("${obj1.name}")
    println("${obj3.name}")
    obj1.myFun()

   /* val obj2:Outer.Nested2 = Outer.Nested2()
    println("${obj2.name}")
    obj2.myFun()*/
}
