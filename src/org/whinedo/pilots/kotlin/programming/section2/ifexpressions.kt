package org.whinedo.pilots.kotlin.programming.section2

fun main(args: Array<String>)
{
    val a = 2
    val b = 5

    var greaterNum:Int

    if(a>b)
    {
        println("a is greater")
        greaterNum = a
    }
    else
    {
        println("b is greater")
        greaterNum = b
    }

    println("The greater finally is $greaterNum")

    var bigNum:Int = if( a > b )
                    {
                        println("a is greater")
                        a
                    }
                    else
                    {
                        println("b is greater")
                        b
                    }

    println("The greater finally is $bigNum")
}
