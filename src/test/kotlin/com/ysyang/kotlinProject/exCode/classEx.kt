package com.ysyang.kotlinProject.exCode

class Myclass{
    val myVal = 10
    var name: String = "ysyang"
    constructor() // 보조 생성자 // 주 생성자와 똑같은 역할
    init {  }
    // init : 객체가 생성될 때 호출 // 보조 생성자보다 먼저 실행
    fun sayHello(){
        println("hello $name")
    }
    class inner(){ }
}

fun main(args: Array<String>){
    var obj1 = Myclass()
    var obj2 = Myclass()
    var obj3 = Myclass1()
    var obj4 = Myclass2()
    var obj5 = Myclass3()

    obj1.name = "yang"
    obj2.name = "yeonsu"

    obj1.sayHello()
    obj2.sayHello()
}



class Myclass1{ // 생성자를 선언 안하면, 자동으로 빈값의 생성자가 생성됨.

}
class Myclass2(){

}

class Myclass3 constructor(){

}
// 위에 세가지는 다 같은 것.



class User1(name: String, age:Int){ // 주 생성자에 선언된 내용은 멤버 함수에서 쓸 수 없음.
    val innerVal = name
    fun sayHello(){
       // println("hello $name") // 에러
        println("hello $innerVal")
    }
}

class User2 constructor(val name: String, age:Int = 0){
    //var, val 사용하는 것 보조 생성자에선 불가능
    fun sayHello(){
        println("hello $name")
    }
}

class User3 constructor(name: String, age:Int = 0){
    val name = "king"
    fun sayHello(){
        println("hello $name")
    }
}

class User4 {
    constructor(name: String, age:Int = 0){}
}

class User5 (name: String){
    init{}
    constructor(name: String, age:Int = 0): this(name){
        //호출 되면 -> this : 주 생성자 호출 -> init 호출 -> 여기 호출
    }
}



val user1 = User1("ys",20)
val user2 = User2("ys")
val user3 = User3("ys")
val user4 = User4("ys")
val user5 = User5("ys")
val user6 = User5("ys",20)
