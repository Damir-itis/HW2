package test

import org.junit.Rule
import org.junit.Test
import org.junit.contrib.java.lang.system.ExpectedSystemExit
import java.util.*

class MainTest {
    @Rule
    val exit: ExpectedSystemExit = ExpectedSystemExit.none()
    var `in` = Scanner(System.`in`)
    @Test
    fun mainTest() {
        exit.expectSystemExitWithStatus(1)
        val args = arrayOfNulls<String>(2)
        main(args)
    }

    @Test
    fun main(args: Array<String?>) {
        val args = arrayOfNulls<String>(3)
        args[0] = "2"
        args[2] = "4"
        args[1] = "+"
        main(args)
    }
}