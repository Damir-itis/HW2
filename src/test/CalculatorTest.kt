package test

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {
    @Test
    fun calculatePlus() {
        val val1 = 2
        val val2 = -4
        val operator = "+"
        assertEquals((val1 + val2).toLong(), Calculator.calculate(val1, operator, val2).toLong())
        assertEquals(0, Calculator.calculate(val2, "e", val1).toLong())
    }

    @Test
    fun calculateMinus() {
        val val1 = 2
        val val2 = -4
        val operator = "-"
        
        assertEquals((val1 - val2).toLong(), Calculator.calculate(val1, operator, val2).toLong())
    }

    @Test
    fun calculateMultiplication() {
        val val1 = 2
        val val2 = -4
        val operator = "*"
        assertEquals((val1 * val2).toLong(), Calculator.calculate(val1, operator, val2).toLong())
    }

    @Test
    fun calculateDivision() {
        val val1 = 2
        val val2 = -4
        val operator = "/"
        assertEquals((val2 / val1).toLong(), Calculator.calculate(val2, operator, val1).toLong())
    }
}