package org.example

fun main() {
    var a: Byte = 100
    var b: Short = 10000
    var c: Int = 1000000000
    var d: Long = 1000000000000000000L
    var e: Float = 0.123f
    var f: Double = 0.123456789
    var g: String = "こんにちは"

    println("----9.3----")
    var a3 = 100
    println("defore a3: $a3")
    a3 = 101
    println("after a3: $a3")

    println("----9.6----")
     var a6 = 100
    a6 += 1
    a6 -= 21
    a6 *= 3
    a6 /= 10
    a6 %= 10
    println(a6)

}