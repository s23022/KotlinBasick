package org.example

fun main() {
    val p = result()
    p.name = "比嘉優太"
    p.age = 5
    println(p.messege)
}

class result {
    var name: String = ""
    var age: Int = 0
    val messege: String

//        get() {
//            return "${name}です。${age}歳です"
get() = "${name}です。${age}歳です" //短い書き方

}