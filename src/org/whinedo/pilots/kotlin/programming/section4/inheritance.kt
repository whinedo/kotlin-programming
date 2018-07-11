package org.whinedo.pilots.kotlin.programming.section4

fun main(args: Array<String>)
{
    var dog1 = MyDog("Pug")
    var cat1 = Cat(10)
    var animal1 = Animal()

}


open class Animal constructor(var color:String="")
{
    init {
        myColor()
    }

    fun myColor()
    {
        println("My color is ${this.color}")
    }

    fun eat()
    {
        println("I am eating!")
    }
}

class MyDog constructor(var breed:String=""): Animal()
{

    init
    {
        bark()
        eat()
    }

    fun bark()
    {
        println("Wooh! Wooh!")
    }

}

class Cat constructor(var age:Int=-1):Animal()
{

    init {

        meow()
        eat()
    }

    fun meow()
    {
        println("Meow! Meow!")
    }


}
