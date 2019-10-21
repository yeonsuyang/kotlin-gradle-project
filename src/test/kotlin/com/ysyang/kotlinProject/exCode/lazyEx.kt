package com.ysyang.kotlinProject.exCode

val someData: String by lazy{
    println("someData lazy")
    "hello"
}

class User10{
    val name:String by lazy{
        println("name lazy")
        "yang"
    }
    val floor:Int by lazy{
        println("age lazy")
        4
    }

    init {
        println("init..")
    }

    constructor(){
        println("constructor..")
    }
}

fun main(args: Array<String>) {
    var user = User10()
    println("use before")
    println("name: ${user.name}")
    println("use after")
    println("age: ${user.floor}")
    println("some data:${ someData}")
    println("name2: ${user.name}")
}
