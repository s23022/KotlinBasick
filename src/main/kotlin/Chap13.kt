package org.example

fun main() {
    val x = 5
    for (i in 1..9) { // 1~9までの計算を出力する
        println("${x}${i}は,${x * i}です")
    }
    println("---13.5----")

    for (a in 800..1000 step 3) { // 800　803 806 と3ずつ増えて計算していく
        println("${x}${a}は,${x * a}です")
    }
    println("---13.7----")

    // for (s in 9..1)だと実行されない
    // downToをしようすると実行できる
    for (s in 9 downTo 1) { // 9~1までの計算を出力する
        println("${x}${s}は,${x * s}です")
    }
}