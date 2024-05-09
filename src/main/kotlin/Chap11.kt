package org.example

fun main() {
    val a = 5
    val b = 10

    if (a < b) {
        println("a のほうが b よりも小さいです")
    } else if (a > b) {
        println(" b のほうが a　よりも小さいです")
    } else {
        println(" a と b どちらも同じ値です")
    }

    println("----11.10----")

    val age = 14
   // var messege = ""

    val messege = if(age in 13..15) {
       // println("中学生です。")
       // messege = "中学生です。"
        "中学生です。"
    } else {
       // println("中学生ではありません。")
       // messege = "中学生ではありません。"
        "中学生ではありません。"
    }
    println(messege)
}