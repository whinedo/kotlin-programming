package org.whinedo.pilots.kotlin.programming.section7

fun main(args: Array<String>) {

    var namesList = mutableListOf<String>("Peter","Sam","Alex")

    namesList.add("Austin")
    namesList.add("Teena")

    namesList.removeAt(1)

    for(name in namesList)
    {
        println(name)
    }
}