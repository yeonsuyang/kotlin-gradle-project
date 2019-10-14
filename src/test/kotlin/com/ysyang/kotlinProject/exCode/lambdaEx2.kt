package com.ysyang.kotlinProject.exCode

fun ilbanSum(x1: Int, x2: Int): Int{
    return x1+x2

}

val lambdasum = {x1: Int, x2: Int -> x1+x2}

fun main(args: Array<String>){
    val result1 = ilbanSum(10,20)
    var result2 = lambdasum(10,20)
    // 변수에 대입하여 호출.

    lambdaCallEx()
}


fun lambdaCallEx(){

    {println("Hello")}() //이름 없는 람다함수 : ()가 호출의 의미
    //정의 후 바로 호출한 예시
    run { print("world") } //run() 함수에 대입하여 호출 가능
}


