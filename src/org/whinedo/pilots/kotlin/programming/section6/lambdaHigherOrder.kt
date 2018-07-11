package org.whinedo.pilots.kotlin.programming.section6

fun main(args: Array<String>) {

    val myLambdaFunc : (Int,Int) -> Int = {x,y -> x+y}

    println(addition(3,2,myLambdaFunc))
    println(addition(3,2,{x:Int, y:Int -> x+y}))

    val result = addition(3,2) {x:Int, y:Int -> x+y}
    println(result)

    val anotherLambda: (Int,Int) -> Unit = {a,b -> println(a+b)}

    add(3,2,anotherLambda)

}

fun addition(a:Int, b:Int, func: (Int, Int) -> Int) : Int
{
    return func(a,b)
}

fun add(a:Int , b:Int, func:(Int,Int)->Unit)
{
    func(a,b)
}
