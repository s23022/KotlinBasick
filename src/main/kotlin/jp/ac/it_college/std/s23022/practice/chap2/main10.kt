package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap2

fun main() {
    println("-----2.10.2-----")
    val list = listOf(1, 2, 3)
    list.forEach { num -> println(num) }

    println("-----2.10.3-----")
    val list2 = listOf(1, 2, 3)
    list.forEach { println(it) }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.4-----")

    val list3 = listOf(1, 2, 3)
    val idList = list.map { it * 10 }
    idList.forEach { println(it) }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.6-----")

    val list4 = listOf(
        User2(1, 100, "Takahata"),
        User2(2, 200, "Kotlin"),
        User2(3, 100, "Java")
    )
    val filteredList = list4.filter { it.teamId == 100 }
    filteredList.forEach { println(it) }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.7-----")

    val list5 = listOf(
        User2(1, 100, "Takahata"),
        User2(2, 200, "Kotlin"),
        User2(3, 100, "Java"),
        User2(4, 200, "Groovy")
    )
    println(list.first())
    println(list.last())
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.8-----")

    val list6 = listOf(
        User2(1, 100, "Takahata"),
        User2(2, 200, "Kotlin"),
        User2(3, 100, "Java"),
        User2(4, 200, "Groovy")
    )
    println(list6.first { it.teamId == 200 })
    println(list6.last { it.teamId == 100 })
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.9-----")

    val list7 = listOf(
        User2(1, 100, "Takahata"),
        User2(2, 200, "Kotlin"),
        User2(3, 100, "Java"),
        User2(4, 200, "Groovy")
    )
    println(list7.firstOrNull { it.teamId == 200})
    println(list7.lastOrNull { it.teamId == 100})
    println(list7.firstOrNull { it.teamId == 1000})
    println(list7.firstOrNull { it.teamId == 1000})
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.10-----")

    val list8 = listOf(1, 1, 2, 3, 4, 4, 5)
    val distinctList = list8.distinct()
    distinctList.forEach { println(it)}
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.11-----")

    val list9 = listOf(
        User2(1, 100, "Takahata"),
        User2(2, 200, "Kotlin"),
        User2(3, 100, "Java")
    )
    val map = list9.associateBy { it.id }
    println(map)
    // mapの各要素をidをキーに取得し出力
    list9.forEach { println(map[it.id])}
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.11+1-----")

    run {
        val students = listOf(
            Student("s300001", "Kuriyama"),
            Student("s300002", "Oohira"),
            Student("s300003", "Tokunaga"),
            Student("s300004", "Kawase"),
            Student("s300005", "Kameda")
        )
        students.forEach(::println)
        //学籍番号をキーとしてmap型に変換
        val studentMap = students.associateBy ( Student::id )
        studentMap.forEach(::println)
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.13-----")

    run{
        val list10 = listOf(
            User2(1, 100, "Takahata"),
            User2(2, 200, "Kotlin"),
            User2(3, 100, "Java"),
            User2(4, 200, "Groovy")
        )
        val map  = list10.groupBy { it.teamId }
        println(map)
        println(map[100])
        println(map[200])
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.14-----")

    val list11 = listOf(1, 2, 3, 4, 5)
    val oddNumberCount = list11.count { it % 2 == 1 }
    println(oddNumberCount)
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.15-----")

    val list12 = listOf("Takahata", "Kotlin", "Java", "Groovy", "Scala")
    val chunkedList = list12.chunked(2)
    println(chunkedList)
    chunkedList.forEach { println(it)}
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.16-----")

    run{
        val list13 = listOf(1, 2, 3, 4, 5)
        val result = list13.reduce { sum, value ->
            println("$sum + $value")
            sum + value
        }
        println(result)
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.10.17-----")

    val list14 = listOf(1, 2, 3, 4, 5)
    val result2 = list14.reduce { sum, value -> sum * value }
    println(result2)
}