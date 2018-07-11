package org.whinedo.pilots.kotlin.programming.section3

import java.math.BigInteger


//WAP to get nth number of Fibonacci Series

//fun fibonacci(nth:Int)
//{
//
//    when (nth)
//    {
//        1 -> return 1
//        else -> 1+fibonacci(nth-1)
//    }

//}

tailrec fun getFibonacciNumber(n:Int, a: BigInteger, b:BigInteger):BigInteger
{
    if (n == 0)
        return b
    else
        return getFibonacciNumber(n-1,a+b,a)
}

fun main(args: Array<String>) {
    println(getFibonacciNumber(3, BigInteger("1"),BigInteger("0")))
    println(getFibonacciNumber(10000, BigInteger("1"),BigInteger("0")))
}

