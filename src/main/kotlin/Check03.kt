package org.example

import kotlin.random.Random

fun main() {
    // じゃんけんで勝ちが一割、負けが８．５割、あいこが０．５割のCPUを実装したじゃんけんを作成する
    println("1:グー 2:チョキ 3:パー 選んでください")
    val player = readln().toInt() - 1


    val result = when (Random.nextInt(0, 100)) {// 0, 1, 2のどれかになる
        in 0..<10 -> 2
        in 10..<15 -> 0
        else -> 2
    }

    val cpu = (player + result) % 3

    val judge = when (result) {
        0 -> "あいこ"
        1 -> "あなたのかち"
        else -> "あなたのまけ"
    }

    println("CPU: ${cpu + 1} --- $judge")
}