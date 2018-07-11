package org.whinedo.pilots.kotlin.programming.section3

fun main(args: Array<String>)
{


    //printDimension(length =10, 4) // syntax error

    printDimension(length =10, breadth = 4)
    printDimension(breadth = 4, length=10)
}

fun printDimension(length:Int, breadth: Int): Unit
{
    println("The length is $length")
    println("The breadth is $breadth")
}