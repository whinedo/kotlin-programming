package org.whinedo.pilots.kotlin.programming.section6

fun main(args: Array<String>) {
    // reverse a string and print it

    val lambda: (String) -> String = {str: String -> str.reversed()}

    reverseAndDisplay("Hello",lambda)
    reverseAndDisplay("Hello",{str -> str.reversed()})
    reverseAndDisplay("Hello",{it.reversed()}) // only when we have just have one parameter
    reverseAndDisplay("Hello"){it.reversed()}
}

fun reverseAndDisplay(str:String, func: (String) -> String)
{
    val result = func(str)
    println(result)
}