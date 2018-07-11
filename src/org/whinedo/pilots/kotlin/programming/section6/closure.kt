package org.whinedo.pilots.kotlin.programming.section6


fun main(args: Array<String>) {

    var result = 0

    println(result)

    val lambda: (Int,Int) -> Unit = {x,y -> result = x+y}
    addTwoNumbers(2,4,lambda)

    println(result)
}

fun addTwoNumbers(a:Int , b:Int, func:(Int,Int)->Unit)
{
    func(a,b)
}
