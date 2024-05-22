package org.example

open class Car1(val color: String) : Any() {
    open fun drive() {
        println("${color}の車が走る")
    }
}