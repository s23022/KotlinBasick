package org.example

fun main() {
    val p = ::calculatePlus
    val m = ::calculateMinus
    printlnRandomValuesCaluclation(p)
    printlnRandomValuesCaluclation(m)
}
fun calculatePlus(x: Double, y: Double) = x + y
fun calculateMinus(x: Double, y: Double) = x - y

fun printlnRandomValuesCaluclation(calculate: (Double, Double) -> Double) {
    val x = Math.random()
    val y = Math.random()
    val result = calculate(x, y)
    println("計算結果は${result}です。")
}