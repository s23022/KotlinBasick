package org.example

fun main() {
    run {
        println("----19.1----")
        val map: Map<String, String> = mapOf(
            "Pen" to "ペン",
            "Apple" to "アップル",
            "Pineapple" to "パイナップル"
        )
        val value1 = map["Pen"]
        val value2 = map["Pineapple"]
        val value3 = map["Apple"]
        val value4 = map["Pen"]
        println("$value1、$value2、$value3、$value4")
    }
    run {
        println("----19.2----")
        val map: Map<Char, Int> = mapOf(
            'a' to 1,
            'b' to 2,
            'c' to 3,
            'z' to 26
        )
        println(map['a'])
        println(map['b'])
        println(map['c'])
        println(map['z'])
    }
    run {
        println("----19.4----")
        val map = mutableMapOf<String, String>()
        map.put("Pen","ペン")
        map["Apple"] = "アップル"
        map += "Pineapple" to "パイナップル"
        val value1 = map["Pen"]
        val value2 = map["Pineapple"]
        val value3 = map["Apple"]
        val value4 = map["Pen"]
        println("$value1、$value2、$value3、$value4")
    }
    run {
        println("----19.5----")
        val map = mutableMapOf<String, String>()
        map.put("Pen","ペン")
        map["Apple"] = "アップル"
        map += "Pineapple" to "パイナップル"
        val value1 = map["Pen"]
        val value2 = map["Pineapple"]
        val value3 = map["Apple"]
        map -= "Pen"
        val value4 = map["Pen"]
        println("$value1、$value2、$value3、$value4")
    }
}