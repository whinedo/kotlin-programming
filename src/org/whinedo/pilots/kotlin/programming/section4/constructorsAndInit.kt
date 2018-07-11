//package org.whinedo.pilots.kotlin.programming.section4

fun main(args: Array<String>)
{
    var dog1 = Dog("German Sheperd",40,"Black")

    dog1.bark()
    dog1.run()

    var dog2 = Dog("Pug",20,"Brown")

    dog2.bark()
    dog2.run()

}

class Dog constructor(var breed:String, var size:Int, var color:String)
{

    /*
    init
    {
        this.breed = breed
        this.size=size
        this.color=color
    }
    */

    init
    {
        println("My name is ${this.breed}, my size is ${this.size} and my color ${this.color}")
    }

    fun bark()
    {
        println("Wooh! Wooh!")
    }

    fun run()
    {
        println("I am running")
    }
}