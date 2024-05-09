package org.example

import kotlin.random.Random

fun main() {
    print("1:グー 2:チョキ 3:パー　を選んでください: ")
    // 入力は1, 2, 3ですが 0, 1, 2になるように工夫する
    val player = readln().toInt() - 1

    val cpu = Random.nextInt(0, 3) // 0, 1, 2のどれかになる
    // 勝敗判定
    //val judge = when {
        //書き方方法１
        //player == 0 && cpu == 0 -> "あいこ"
        //player == 0 && cpu == 1 -> "かち"
        //player == 0 && cpu == 2 -> "まけ"
        //player == 1 && cpu == 0 -> "まけ"
        //player == 1 && cpu == 1 -> "あいこ"
        //player == 1 && cpu == 2 -> "かち"
        //player == 2 && cpu == 0 -> "かち"
        //player == 2 && cpu == 1 -> "まけ"
        //player == 2 && cpu == 2 -> "あいこ"
        //else -> "?"

        //書き方方法２
        // val judge = when {
        //player == cpu -> "あいこ"
        //player == 0 && cpu == 1 || player == 1 && cpu == 2 || player == 2 && cpu == 0 -> "あなたのかち"
        //player == 0 && cpu == 2 || player == 1 && cpu == 0 || player == 2 && cpu == 1 -> "あなたのまけ"
        //else -> "?"

        //書き方方法３
        val diff = (player - cpu + 3) % 3
        val judge = when (diff) {
            0 -> "あいこ"
            1 -> "まけ"
            2 -> "かち"
            else -> "?"
        }
    println("CPU: ${cpu + 1} --- $judge")
}