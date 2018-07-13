package org.whinedo.pilots.kotlin.programming.section8

fun main(args: Array<String>) {

    val name: String? = null  // use "?" when initializing to null

    // 1. Safe Call (?.)
        // Use it when you don't mind getting value as Null
    println("The length of the name is ${name?.length}") // "?"

    // 2.Safe Call with let ( ?.let)
        // It executes the block ONLY IF is NOT NULL
    name?.let {
        println("The length of the name is ${name.length}") // "?.let"
    }

    // 3.Non-null assertion operator (!!)
        // Use it when ypu are sure the value is NOT NULL
        // Throws NullPointerException if the value is found to be null

    println("The length of the name is ${name!!.length}") // "!!"

}