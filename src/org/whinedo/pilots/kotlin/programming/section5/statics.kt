package org.whinedo.pilots.kotlin.programming.section5

fun main(args: Array<String>) {

    val valueObject = ValueObject

    println("Pi value from object: ${valueObject.pi}")
    println("Pi value from class: ${ValueClass.Companion.pi}")
    println("Pi value from class: ${ValueClass.pi}")

}


// static as object
object ValueObject
{
    // companion object is initialized when accessed
    val pi = 3.14
}

//static as companion object
class ValueClass
{
    companion object {
        // companion object is initialized when class is loaded
        val pi = 3.14
    }
}