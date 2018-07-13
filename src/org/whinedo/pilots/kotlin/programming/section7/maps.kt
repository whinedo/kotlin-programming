package org.whinedo.pilots.kotlin.programming.section7

fun main(args: Array<String>) {

    // Immutable Map: Fixed size, Read only

    var immutableMap = mapOf<Int, String>(2 to "USA",5 to "India", 1 to "China")

    for (key in immutableMap.keys)
    {
        println(immutableMap.get(key))
    }

    // Mutable Map: No Fixed size, Read and Write

    var mutableMap = mutableMapOf<Int,String>()


    mutableMap.put(2,"USA")
    mutableMap.put(5,"India")
    mutableMap.put(1,"China")

    mutableMap.remove(2)
    mutableMap.replace(1,"Nepal")

    for (key in mutableMap.keys)
    {
        println(mutableMap.get(key))
    }


    var hashMap = hashMapOf<Int,String>()


    hashMap.put(2,"USA")
    hashMap.put(5,"India")
    hashMap.put(1,"China")

    hashMap.remove(2)
    hashMap.replace(1,"Nepal")

    for (key in hashMap.keys)
    {
        println(hashMap.get(key))
    }

}