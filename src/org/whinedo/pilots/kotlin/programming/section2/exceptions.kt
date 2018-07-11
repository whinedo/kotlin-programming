package org.whinedo.pilots.kotlin.programming.section2

fun main(args: Array<String>)
{

    var result = 8 / 2
    println("The result is $result")

    try {

        var result2 = 8 / 0
        println("The result2 is $result2")
    }
    catch (ex: Exception)
    {
        println("You cannot divide a number by Zero")
    }
    finally
    {
        println("Finally block is always executed")
    }
}
