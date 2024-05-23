package org.example

fun main(args: Array<String>) {
    run {
        println("----35.2----")
        val p1 = Person("タケシ", 1234)
        val p2 = Person("ケンタ", 5678)
        if (p1 == p2) {
            println("二人は同一人物")
        } else {
            println("二人は別人")
        }
    }
    run {
        println("----35.3----")
        val p1 = Person("タケシ", 1234)
        val p2 = Person("タケシ", 1234)
        if (p1 == p2) {
            println("二人は同一人物")
        } else {
            println("二人は別人")
        }
    }
    run {
        println("----broken----")
        val p1 = BrokenPerson("タケシ", 1234)
        val p2 = BrokenPerson("タケシ", 1234)
        if (p1 == p2) {
            println("二人は同一人物")
        } else {
            println("二人は別人")
        }
    }
}

// 35.1
data class Person(val name: String, val myNumber: Int)

class BrokenPerson(val name: String, val myNumber: Int)