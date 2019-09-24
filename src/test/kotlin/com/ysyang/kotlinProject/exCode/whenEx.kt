package com.ysyang.kotlinProject.exCode

fun cases(obj: Any): String{
    when(obj){
        1-> return "One"
        "hello" -> return "Greeting"
        is Long -> return "Long"
        !is String -> return "Not a String"
        else -> return "unknown"
    }
}


fun cases2(obj: Any){

    var list = listOf<Int>(10,20,30)
    var array = arrayOf<Int>(60,70,80)

    when(obj){
        10,20 -> println("data is 10 or 20")
        30 + 30 -> println("data is 60")
        some() -> println("data is 50")
        in 11..20 -> println("data is 11~20")
        !in 11..20 -> println("data is not 11~20")
        in list -> println("data in list")
        in array -> println("data in array")
        else -> println("data ?")
    }

    var data = 2
    when{
        data <= 10 -> println("data < 10")
        data > 10 && data <= 20 -> println("10 < data <= 20")
        else -> println("data > 20")
    }
}

fun some(): Int{
    return 50
}


fun main(args: Array<String>){
    println(cases(1))
    println(cases(10))
}
