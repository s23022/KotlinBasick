package ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap2

//デリート機能を使用
class AddCalculationExecutorDelegate(private val calculationExecutor: CommonCalculationExecutor) :
    CalculationExecutor by calculationExecutor {
    override fun calc(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}