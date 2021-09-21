package test
import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.ExpectedSystemExit

class ParserTest {
    @Rule
    val exit = ExpectedSystemExit.none()
    @Test
    fun parseOperatorOrErrorPlus() {
        val operator = "+"
        Parser.parseOperatorOrError(operator)
    }

    @Test
    fun parseOperatorOrErrorMinus() {
        val operator = "-"
        Parser.parseOperatorOrError(operator)
    }

    @Test
    fun parseOperatorOrErrorMultiplication() {
        val operator = "*"
        Parser.parseOperatorOrError(operator)
    }

    @Test
    fun parseOperatorOrErrorDivision() {
        val operator = "/"
        Parser.parseOperatorOrError(operator)
    }

    @Test
    fun parseOperatorOrError() {
        val operator = "%"
        exit.expectSystemExitWithStatus(3)
        Parser.parseOperatorOrError(operator)
    }

    @Test
    fun parseIntOrError() {
        val string = "D"
        exit.expectSystemExitWithStatus(2)
        Parser.parseIntOrError(string)
    }
}