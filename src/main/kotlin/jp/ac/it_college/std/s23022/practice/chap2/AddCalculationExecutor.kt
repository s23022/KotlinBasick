package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap2

class AddCalculationExecutor(private val calculationExecutor: CalculationExecutor) :
    CalculationExecutor {
        override val messege: String
            get() = calculationExecutor.messege

        override fun calc(num1: Int, num2: Int): Int {
            return num1 + num2
        }
        override fun printStartMessege() {
            calculationExecutor.printStartMessege()
        }
    }

