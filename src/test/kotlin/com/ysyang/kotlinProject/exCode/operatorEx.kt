package com.ysyang.kotlinProject.exCode

fun some(vararg a: String){
    val iterator = a.iterator()
    //while(iterator.hasNext()){
    //    println(iterator.next())
  //  }
}

fun main(args: Array<String>) {
    val array = arrayOf<String>("yang","yeonsu")
    some(*array)


    val a: Int = 10
    val b: Int = 5
    val obj:OperatorClass = OperatorClass(10)

    val result: Int = a.plus(b)
    var result1 = obj + 10
    var result2 = obj - 10

    println(result)
    println(result1)
    println(result2)
}

data class OperatorClass(val no: Int){
    operator fun plus(arg: Int): Int{
        return no - arg
    }
}

operator fun OperatorClass.minus(args: Int): Int{
    return no + args
}
