package com.ysyang.kotlinProject.exCode

open class Person(val firstName: String, val lastName: String, var age: Int) {
    open val fullName: String // open 작성
        get() = firstName + " " + lastName
}

class EasternPerson(firstName: String, lastName: String, age: Int) : Person(firstName, lastName, age) {
    override val fullName: String
        get() = lastName + " " + firstName
}

