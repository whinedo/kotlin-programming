package org.whinedo.pilots.kotlin.programming.section4


fun main(args: Array<String>) {

    var remote:Remote = Television()

    remote.poweOn()
    remote.powerOff()

    remote.about()
    remote.brand = "Sansui"
}

interface Remote
{

    var brand:String

    abstract fun poweOn()

    fun powerOff()

    open fun about()
    {
        println("I am Remote interface")
    }

}

class Television: Remote
{

    override var brand:String = ""

    override fun powerOff() {
        println("The Tv is now switched OFF")
    }

    override fun poweOn() {
        println("The Tv is now switched ON")
    }

    override fun about()
    {
        println("I am a Tv")
        super.about()
    }

}