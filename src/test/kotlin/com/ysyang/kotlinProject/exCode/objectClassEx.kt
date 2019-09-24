package com.ysyang.kotlinProject.exCode

class normalClass {
    fun myFun(){}
}

object objectClass{
    fun myFun(){}
}

fun main(args: Array<String>){
    var obj1: normalClass = normalClass()
    obj1.myFun()

   // var obj2: objectclass = objectClass()
    objectClass.myFun()
}


