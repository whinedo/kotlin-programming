package org.whinedo.pilots.kotlin.programming.section7

fun main(args: Array<String>) {

    // Immutable list: fixed size, read only

    var namesList = listOf<String>("Peter","Sam","Alex")

    

    for (name in namesList)
    {
        println(name)
    }


}
