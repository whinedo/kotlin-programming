package org.whinedo.pilots.kotlin.programming.section3



fun rectangleArea(lenght:Int , breadth:Int): Int
{
    return lenght*breadth
}


fun printRectangleArea(lenght:Int , breadth:Int): Unit
{
    // Unit is similar to void in C,Java, ...
    println(rectangleArea(lenght,breadth))
}

fun main(args: Array<String>)
{
    printRectangleArea(3,4)
    printRectangleArea(199,900)
}