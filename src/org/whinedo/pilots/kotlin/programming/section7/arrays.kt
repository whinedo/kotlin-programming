package org.whinedo.pilots.kotlin.programming.section7

fun main(args: Array<String>) {

    var numbers = Array<Int>(5) {0} // Mutable

    var names = Array<String>(20) {""}

    numbers[2] = 54

    for(num in numbers)
    {
        println(num)
    }

    // OR

    for( index in 0..numbers.size-1)
    {
        println(numbers[index])
    }

    for (name in names)
    {
        println(name)
    }

}