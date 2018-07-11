package org.whinedo.pilots.kotlin.programming.section2

fun main(args: Array<String>)
{

    println("For loop")
    for (x in 1..10)
    {
        if(x % 2 == 0)
        {
            println(x)
        }
    }

    var c:Int = 1

    println("While loop")
    while(c <= 10)
    {
        if(c % 2 == 0)
        {
            println(c)
        }

        c++
    }

    println("Do-While loop")
    var i = 1
    do {

        if(i % 2 == 0)
        {
            println(i)
        }

        i++

    } while( i <=10)

}
