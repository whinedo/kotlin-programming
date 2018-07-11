package org.whinedo.pilots.kotlin.programming.section4

fun main(args: Array<String>)
{
    var dog1 = Dog()
    dog1.breed = "German Sheperd"
    dog1.size = 40
    dog1.color = "Black"

    dog1.bark()
    dog1.run()

    var dog2 = Dog()
    dog2.breed = "Pug"
    dog2.size = 20
    dog2.color = "Brown"

    dog2.bark()
    dog2.run()

    println("My name is ${dog1.breed}, my size is ${dog1.size} and my color ${dog1.color}")
    println("My name is ${dog2.breed}, my size is ${dog2.size} and my color ${dog2.color}")
}

class Dog
{
    var breed:String = ""  // Property
    var size: Int = -1
    var color: String = ""


    fun bark()
    {
        println("Wooh! Wooh!")
    }

    fun run()
    {
        println("I am running")
    }
}