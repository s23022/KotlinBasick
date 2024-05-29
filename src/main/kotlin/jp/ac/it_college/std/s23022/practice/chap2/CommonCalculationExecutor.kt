package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap2

class CommonCalculationExecutor(override val messege: String = "calc") : CalculationExecutor{
    override fun calc(num1: Int, num2: Int): Int {
        throw IllegalStateException("Not implements calc")
    }
    override fun printStartMessege() {
        println("start $messege")
    }
}