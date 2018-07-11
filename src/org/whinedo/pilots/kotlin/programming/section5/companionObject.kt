package org.whinedo.pilots.kotlin.programming.section5

fun main(args: Array<String>) {

    println(School.pi)

    println(School.findArea(20,10))

}

class School {
    companion object {
        val pi = 3.14 // static variable


        fun findArea(l: Int, b: Int): Int { // static function
            return l * b;
        }

    }
}
