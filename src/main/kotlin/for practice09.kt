package org.example

fun main() {
    val list: List<String?> = listOf("あ", "い", "う", null, "お")
    for (text in list) {
        if (text != null)
            println(text)
    }
    println("-----------------------------------------")
    val sample: List<String?> = listOf("あ", "い", "う", null, "お")
    for (text in sample) {
        text?.let { println(it)}
    }
}