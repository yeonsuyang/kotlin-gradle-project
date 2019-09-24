package com.ysyang.kotlinProject.exCode

data class User(val no: Int, val name: String, val email: String)

fun main(args: Array<String>){
    val list = ArrayList<User>()
    var user1  = User(1, "ys.yang", "ys.yang@alticast.com")
    list.add(user1)

    var user2 = User(1, "ys.yang", "ys.yang@alticast.com")
    list.add(user2)
    println("List Size : ${list.size}")

    if(user1.equals(user2)){
        println("user1 == user2")
    }else {
        println("user1 != user2")
    }
}
