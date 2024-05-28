package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap2

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("-----2.7.1-----")

    val list = mutableListOf<Int>()
    for (i in 1..10) {
        if (i % 2 == 1) list.add(i)
    }
    val oddNumbers = list.joinToString(separator = " ")
    println(oddNumbers)
//////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.7.2--2.7.3-----")

    val oddNumbers2 = with(mutableListOf<Int>()) {
        for (i in 1..10) {
            if (i % 2 == 1) this.add(i)
        }
        this.joinToString(separator = " ")
    }
    println(oddNumbers2)

    val oddNumbers3 = with(mutableListOf<Int>()) {
        for (i in 1..10) {
            if (i % 2 == 1) add(i)
        }
        joinToString(separator = " ")
    }
    println(oddNumbers3)
//////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.7.4-----")

    val oddNumber4 = mutableListOf<Int>().run {
        for (i in 1..10) {
            if (i % 2 == 1) this.add(i)
        }
        this.joinToString(separator = " ")
    }
    println(oddNumber4)
//////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.7--おまけ-----")
    randomGenerateNumber()?.run{
        println("１回目: ${this}が生成されました")
        println("${this}の３倍は${this * 3}です。")
    }
    randomGenerateNumber()?.run{
        println("2回目: ${this}が生成されました")
        println("${this}の３倍は${this * 3}です。")
    }
    randomGenerateNumber()?.run{
        println("3回目: ${this}が生成されました")
        println("${this}の３倍は${this * 3}です。")
    }
    randomGenerateNumber()?.run{
        println("4回目: ${this}が生成されました")
        println("${this}の３倍は${this * 3}です。")
    }

}
fun randomGenerateNumber(): Int? {
    return if (Random.nextBoolean()) Random.nextInt(1..10) else null
}
