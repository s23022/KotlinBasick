package org.example

fun main(args: Array<String>) {
    val p = sample()
    p.name = "比嘉優太"
    p.age = 5
    p.greet()

    val n = p.name
    val a = p.age
    println("変数 n の値:${n}")
    println("変数 a の値:${a}")
}

class sample {
    var name: String = ""
    var age: Int = 0
    fun greet() {
        println("こんにちは、私の名前は${name}!。年齢は${age}歳です")
    }
}