package org.whinedo.pilots.kotlin.programming.section5

fun main(args: Array<String>) {

    val radius = 4
    println(Trigonometry.pi * radius * radius)
    println(Trigonometry.pi * radius * radius)

    println(Trigonometry.findArea(6,2))
}

object Trigonometry: Maths()
{
    val pi = 3.14 // static variable


    override fun findPerimeter(l:Int, b:Int):Int // static function
    {
        return super.findPerimeter(l, b)
    }
}

open class Maths
{

    fun findArea(l:Int,b:Int): Int
    {
       return l * b;
    }

    open fun findPerimeter(l:Int, b:Int):Int
    {
        return 2 * ( l + b)
    }
}