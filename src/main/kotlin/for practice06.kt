package org.example

fun main(args: Array<String>) {
    val p = Sample()
    p.name = "たけし"
    p.age = 5
    p.greet()
}
class Sample() {
    var name: String = ""
    var age: Int = 0
    fun greet() {
        println(" ${name}です。${age}歳です")
    }
}

