package org.whinedo.pilots.kotlin.programming.section7

fun main(args: Array<String>) {

    // Immutable Set

    val list = listOf<Int>(34,12,6,2,5,9,9,9,8)

    for (num in list)
    {
        println(num)
    }

    val set = setOf<Int>(34,12,6,2,5,9,9,9,8)

    for (num in set)
    {
        println(num)
    }


    // Mutable Set

    var mutableSet = mutableSetOf<Int>(34,12,6,2,5,9,9,9,8)

    mutableSet.add(90)
    mutableSet.remove(12)

    for (num in mutableSet)
    {
        println(num)
    }

}