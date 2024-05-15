package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    while (Random.nextInt(0..<100) >= 10) {
        println("10以上の数が生成されました。")
    }
    println("おわり")

    println("----14.e2----")

    do {
        val rand = Random.nextInt(8..<100)
        println("生成された数は $rand です。")
    } while (rand >= 100)
    println("10未満の数が生成されたので終わり")
}