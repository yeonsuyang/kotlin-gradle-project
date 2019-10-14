package com.ysyang.kotlinProject.exCode

val bar = 23

// 결과를 바로 변수에 대입
val name = if (bar < 42) {
    "yang"
} else {
    "yeonsu"
}

// 삼항연산자
val age = if (bar < 42) "21" else "22"


class Cat{

    fun catMethod() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


fun main(args: Array<String>) {

    val animal = Cat()

    if (animal is Cat) { // Smart Cast
        animal.catMethod()
    }
}

/*



 */