package kotlin

class Parser {
    fun parseOperatorOrError(operator: String): String {
        if ("+" == operator || "-" == operator || "*" == operator || "/" == operator) {
            return operator
        }
        println("Operator is not supported")
        System.exit(3)
        return ""
    }

    fun parseIntOrError(value: String): Int {
        return try {
            Integer.parseInt(value)
        } catch (e: NumberFormatException){
            println("Val1 is not int")
            System.exit(2)
            0
        }
    }
}