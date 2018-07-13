package org.whinedo.pilots.kotlin.programming.section7

fun main(args: Array<String>) {

    val numbers: List<Int> = listOf(2,3,4,6,23,90)

    //val smallNumbers = numbers.filter{num -> num < 10} // similar
    val smallNumbers = numbers.filter{it < 10}

    for (num in smallNumbers){
        println(num)
    }


    val largeNumbers = numbers.filter{it > 10}

    for (num in largeNumbers){
        println(num)
    }


    val namesList = listOf<String>("Peter","Sam","Alex")

    val namesWithS = namesList.filter{it.startsWith("S")}


    for (name in namesWithS){
        println(name)
    }

}