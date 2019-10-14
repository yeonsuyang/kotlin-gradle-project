package com.ysyang.kotlinProject.exCode

interface Foo {
    val bar: Int
    fun baz(qux: String)
}


class ConcreteFoo(override val bar: Int): Foo {
    override fun baz(qux: String) {
        println(qux)
    }
}

