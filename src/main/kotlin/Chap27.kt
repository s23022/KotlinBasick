package org.example

fun main(args: Array<String>) {
    run {
        println("----27.2----")
        val car = Car()
        car.drive(5.0)
        car.drive(10.0)
    }
    run {
        println("----27.4----")
        val car = Ferrari()
        car.drive(5.0)
        car.drive(10.0)
    }
    run {
        println("----27.5----")
        val car = Ferrari5("赤")
        car.drive(5.0)
        car.drive(10.0)
    }
}

open class Car() {      // 27.1
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("車が ${d}km 走りました。")
        println("マイレージは ${distance}キロになりました。")
    }
}

open class Car5(val color: String) {      // 27.5
    var distance = 0.0
    open fun drive(d: Double) {
        distance = distance + d
        println("${color}の車が ${d}km 走りました。")
        println("マイレージは ${distance}キロになりました。")
    }
}

class Ferrari() : Car()     // 27.3
class Ferrari5(color: String) : Car5(color)     // 27.5