package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap2

fun main() {
    println("-----2.9.3-----")

    val executor = AddCalculationExecutor(CommonCalculationExecutor())
    executor.printStartMessege()
    println(executor.calc(8, 11))

//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.9.5-----")// デリート機能を使用したクラス

    val executorDelegate = AddCalculationExecutorDelegate(CommonCalculationExecutor())
    executorDelegate.printStartMessege()
    println(executorDelegate.calc(8, 20))

//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.9.7-----")// 委譲プロパティ プロパティの実装を外部へ切り出して委譲する機能

    val person = Person()
    person.name = "takahata"
    person.address = "Tokyo"
    println(person.name)
    println(person.address)

//////////////////////////////////////////////////////////////////////////////////////////////////////
    println("-----2.9.9-----")

    val delegatePerson = DelegatePerson()
    delegatePerson.name = "Takahata"
    delegatePerson.address = "Tokyo"
    println(delegatePerson.name)
    println(delegatePerson.address)

}
