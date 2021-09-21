package kotlin
import jdk.internal.*

class Calculator {
     fun calculate(value1: Int, operator: String, value2: Int): Int {
        return when (operator) {
            "+" -> value1 + value2
            "-" -> value1 - value2
            "/" -> value1 / value2
            "*" -> value1 * value2
            else -> 0
        }
    }
}