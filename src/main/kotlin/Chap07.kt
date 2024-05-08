package org.example

fun main() {
    val delicious = true
    val cheep = false
    val letsEat = (delicious && cheep)
    println("食事する？: $letsEat")

    val delicious1 = true
    val cheep1 = false
    val letsEat1 = delicious1 && cheep1
    println("食事する？: $letsEat1")

    val delicious2 = false
    val cheep2 = true
    val letsEat2 = delicious2 && cheep2
    println("食事する？: $letsEat2")

    val delicious3 = true
    val cheep3 = true
    val letsEat3 = delicious3 && cheep3
    println("食事する？: $letsEat3")

    val delicious4 = false
    val cheep4 = false
    val letsEat4 = delicious4 && cheep4
    println("食事する？: $letsEat4")
    println("----7.6----")
    val delicious5 = true
    val cheep5 = false
    val letsEat5 = (delicious5 || cheep5)
    println("食事する？: $letsEat5")

    val delicious6 = true
    val cheep6 = false
    val letsEat6 = delicious6 || cheep6
    println("食事する？: $letsEat6")

    val delicious7 = false
    val cheep7 = true
    val letsEat7 = delicious7 || cheep7
    println("食事する？: $letsEat7")

    val delicious8 = true
    val cheep8 = true
    val letsEat8 = delicious8 || cheep8
    println("食事する？: $letsEat8")

    val delicious9 = false
    val cheep9 = false
    val letsEat9 = delicious9 || cheep9
    println("食事する？: $letsEat9")
    println("----7.10----")

    val x10 = 75
    val a10 = (x10 >= 50 && x10 <= 100)
    val b10 = (x10 < 50 || x10 > 100)
    println("変数 x10 が50から100の範囲内にある: $a10")
    println("変数 x10 が50から100の範囲外にある: $b10")
}