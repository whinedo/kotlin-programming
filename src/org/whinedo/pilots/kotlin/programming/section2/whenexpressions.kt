package org.whinedo.pilots.kotlin.programming.section2

fun main(args: Array<String>)
{

    val x = 7

    when (x)
    {
        1 -> println("x is 1")
        2 -> println("x is 2")
        //5,6,7,8,9,10 -> println("x lies between 5 and 10") // old fashion way
        in 5..10 -> println("x lies between 5 and 10") // range way
        else ->
        {
            println("x is unknown")
            println("None os the criteria met")
        }
    }

    // cleaner solution

    var str:String

    when (x)
    {
        1 -> str = "x is 1"
        2 -> str = "x is 2"
    //5,6,7,8,9,10 -> println("x lies between 5 and 10") // old fashion way
        in 5..10 -> str = "x lies between 5 and 10" // range way
        else ->
        {
            str = "x is unknown"
        }
    }

    println(str)

    // functional style

    var strFun:String = when (x)
                 {
                      1 ->"x is 1"
                      2 ->"x is 2"
                    //5,6,7,8,9,10 -> println("x lies between 5 and 10") // old fashion way
                    in 5..10 ->"x lies between 5 and 10" // range way
                    else ->
                        "x is unknown"
                }

    println(str)
}
