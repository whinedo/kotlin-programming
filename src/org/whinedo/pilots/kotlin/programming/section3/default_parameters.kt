package org.whinedo.pilots.kotlin.programming.section3

fun main(args: Array<String>)
{
    //WAP to find volume of cuboid ( length * breadth * height )

    var result = findVolume(30,10,5)
    var result2 = findVolume(30,10)
    println("The volume is $result")
    println("The volume is $result2")
}

fun findVolume(lenght: Int, breadth: Int, height: Int = 5): Int
{
    return lenght * breadth * height
}