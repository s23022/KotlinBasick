package org.example

fun main() {

    val age: Int = 10

    val range1: IntRange = 0..6
    val range2: IntRange = 7..12
    val range3: IntRange = 13..15

    val flag1 = age in range1
    val flag2 = age in range2
    val flag3 = age in range3

    println("${age}歳の子供は就学前 ${flag1}")
    println("${age}際の子供は小学生 ${flag2}")
    println("${age}歳の子供は中学生 ${flag3}")

    println("----10.3----")

    val range4: IntRange = 0..6
    val range5: IntRange = 7..12
    val range6: IntRange = 13..15

    val flag4 = age !in range4
    val flag5 = age !in range5
    val flag6 = age !in range6

    println("${age}歳の子供は就学前 ${flag4}")
    println("${age}際の子供は小学生 ${flag5}")
    println("${age}歳の子供は中学生 ${flag6}")

    println("----10.4----")

    val range_a: LongRange = 0..10000000000L
    val range_b: CharRange = 'A'..'E'
    val range_c: CharRange = 'あ'..'お'

    val flag_a = 500 in range_a
    val flag_b = 'D' in range_b
    val flag_c = 'え' in range_c

    println("flag_a = ${flag_a}")
    println("flag_b = ${flag_b}")
    println("flag_c = ${flag_c}")

    println("----10.1----")

    val rangeA: IntRange = 0 until 6
    val rangeB: IntRange = 0..<6
    println(rangeA)
    println(rangeB)
}