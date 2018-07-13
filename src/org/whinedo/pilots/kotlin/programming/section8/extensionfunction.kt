package org.whinedo.pilots.kotlin.programming.section8

fun main(args: Array<String>) {

    val camera = Camera()

    camera.openCamera()
    camera.takePictures()
    camera.saveThePic()
}

fun Camera.applyFilter() // Extension Function
{
    println("Gloss Filter applied!")
}

class Camera
{
    fun openCamera()
    {
        println("Camera is now opened")
    }

    fun takePictures()
    {
        println("Picture Clicked! Time to Save it !")
    }

    fun saveThePic()
    {
        println("Picture Saved to sdcard/DCIM")
    }

}