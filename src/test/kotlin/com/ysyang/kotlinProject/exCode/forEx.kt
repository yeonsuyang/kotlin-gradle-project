package com.ysyang.kotlinProject.exCode

var arrayInt = arrayOf<Int>(10,20,30)

fun main(args: Array<String>){
    for(number in arrayInt){
        println(number)
    }

    for(i in 0 until 100){
        print(i)
    }


    var sum: Int = 0
    for(i in 1..100){
        sum += i
    }
    println(sum)

    //인덱스 값 사용
    val list = listOf("yeonsu","yang","!")
    for( i in list.indices){
        println(list[i])
    }

    //인덱스와 값 모두 이용
    for((index,value) in list.withIndex()){
        println("$index is $value")
    }

    for(x in 2..10 step 2){
        //2씩 증가
    }
    for(x in 10 downTo 1){
        //1씩 감소
    }


}

