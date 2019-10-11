package com.ysyang.kotlinProject.exCode

class CoEx {
    companion object{
        val TAG = "MyClass"
        fun createFiles(){

        }
    }
}

fun main(args: Array<String>){

    println("TAG: " + CoEx.TAG)
    println("TAG: " + CoEx.Companion.TAG)

    CoEx.createFiles()
    CoEx.Companion.createFiles()
}
