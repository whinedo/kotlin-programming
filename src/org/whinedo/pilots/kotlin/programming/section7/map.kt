package org.whinedo.pilots.kotlin.programming.section7

fun main(args: Array<String>) {

    val numbers: List<Int> = listOf(2,3,4,6,23,90)

    val squaredNumbers = numbers.map{it*it}

    for (x in squaredNumbers)
    {
        println(x)
    }

    val squaredSmallNumbers = numbers.filter{it<10}.map{ it * it }

    for (y in squaredSmallNumbers)
    {
        println(y)
    }
}