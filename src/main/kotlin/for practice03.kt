package org.example

fun main(args: Array<String>) {
    val p = Person()
    p.age = 30
    p.age = 25
    p.age = 80
    p.age = 10

}

class Person {
    var age: Int = 20
        set(value) {
            print("${field}歳から ${value}歳になりました")
            if(value<field) println(" -> なんと！若返りました")
            else if(value>field) println(" -> 歳を取るのは嫌だなあ")
            field = value
        }
}