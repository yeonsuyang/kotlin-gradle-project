package com.ysyang.kotlinProject.exCode

class User11{
    var name:String? = null
    var floor:Int? = null

    constructor(name:String, floor:Int){
        this.name = name
        this.floor = floor
    }
}

fun testFun(user: User11) {
    println("TestFun() : ${user.name},${user.floor}")
}

fun main(args: Array<String>) {
   // val user = User11("yeonsu",4)
    //testFun(user)

    User11("yeonsu",4).let { user -> testFun(user) }
    User11("yeonsu",4).let {testFun(it) }
}
