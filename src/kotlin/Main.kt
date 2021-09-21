package kotlin

import kotlin.Calculator

class Main {
    fun main(args: Array<String>){

        val parser = Parser()
        if (args.size < 3){
            println("Args format is: val1 +-/* val2")
            System.exit(1)
            return
        }

        val val1 = parser.parseIntOrError(args[0])
        val val2 = parser.parseIntOrError(args[2])
        val operator = parser.parseOperatorOrError(args[1])

        val calculator = Calculator()
        val result = calculator.calculate(val1, operator, val2)

        println("Result is $result")
    }
}