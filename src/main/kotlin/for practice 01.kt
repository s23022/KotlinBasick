package org.example

import java.util.*


fun main() {
    while(true) {
        val sample = Random().nextInt(100)
        println("乱数: ${sample}")

        if(sample<10) break
    }
}