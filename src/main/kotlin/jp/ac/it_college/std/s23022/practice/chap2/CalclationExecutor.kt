package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap2

interface CalculationExecutor {
    val messege: String
    fun calc(num1: Int, num2: Int): Int
    fun printStartMessege()
}