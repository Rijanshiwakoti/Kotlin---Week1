package com.example.firstclass

import androidx.compose.animation.scaleOut

//list
fun dispalyList(){
    val numbers: List<String> = listOf("one","two","three")
    println("Number of elements:${numbers.size}")
    println("third element: ${numbers.get(2)}")
    println("Second element: ${numbers[1]}")
    println("Index of element \"two\"${numbers.indexOf("two")}")

}
fun main() {
    //Immutable List
    val lst = listOf("one","two","three")
    println("mutable list")
    for (i in lst.indices){
        println(lst[i])
    }
    println()
    //mutable List
    val mutableList = mutableListOf("one","two","three")
    mutableList.add("four")
    println("Immutable list")
    for (i in mutableList.indices) {
        println(mutableList[i])
    }
}

fun set(){
    val numbers = setOf(1,2,3,4)
    for (elements in numbers){
        println(elements)
    }
    val numbersBackwards = setOf(4,3,2,1)
    println("The Sets are equal: ${numbers ==numbersBackwards}")
}

fun map(){
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )
    println("All keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")
//Immutable maps

    val studentMarks = mapOf(
         "ram" to 45,
         "shyam" to 45,
         "hari" to 45,
         "gita" to 45,
    )
    println("Enter student name: ")
    val input: String = readln().lowercase()
    println(studentMarks[input])
    //mutable

    val studentMarks2 = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    studentMarks2["ram"] = 60
    studentMarks2.put("sabin",80)
    println("Enter student name: ")
    val input2: String = readln().lowercase()
    println(studentMarks [input])
}
