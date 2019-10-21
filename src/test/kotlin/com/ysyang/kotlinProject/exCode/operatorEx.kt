package com.ysyang.kotlinProject.exCode

import java.util.*

fun some(vararg a:Array<String>){

    val iterator = a.iterator()
   // while(iterator.hasNext()){
        //println(iterator.next())
   //}
}

class People{
    var name: String? = null
    var age: Int?  = null
    var tall: Int?  = null
}

fun main(args: Array<String>) {
    val array = arrayOf<String>("yang","yeonsu")
    some(array)


    val array2 = arrayOf(10,11,12,13,14)
    var list = Arrays.asList(8,9,*array2,15)
    list.forEach { x -> print("$x  ")}


    val p = People()
    p.name = "임꺽정"
    p.age = 40
    p.tall = 190

   /* val a: Int = 10
    val b: Int = 5
    val obj:OperatorClass = OperatorClass(10)

    val result: Int = a.plus(b)
    var result1 = obj + 10
    var result2 = obj - 10

    println(result)
    println(result1)
    println(result2)*/
}

/* data class OperatorClass(val no: Int){
    operator fun plus(arg: Int): Int{
        return no - arg
    }
}*/

/*operator fun OperatorClass.minus(args: Int): Int{
    return no + args
}*/


