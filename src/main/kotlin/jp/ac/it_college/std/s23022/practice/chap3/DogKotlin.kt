package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap3

import jp.ac.it_college.std.s23022.practice.chap3.AnimalJava

class DogKotlin: AnimalJava() {
    override fun cry() {
        println("bowwow")

        val dog = DogKotlin()
        dog.cry()
    }
}