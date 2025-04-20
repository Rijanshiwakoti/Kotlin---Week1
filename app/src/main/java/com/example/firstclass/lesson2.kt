package com.example.firstclass


fun main(args: Array<String>) {

var age = arrayOf(1,2,3)
println(age)
println("The first element of age is "+ age[0])
println("The second element of age is "+ age[1])
println("The third element of age is "+ age[2])
println("***** ******")
var name = arrayOf("ram", "shyam", "Hari")
name[1] = "sandis"
println("The first element of name is "+ name[0])
    println("The second element of name is "+ name[1])
    println("The third element of name is "+ name[2])
println(name.size)
    var age1= ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)
//we can add value directly in array whilr initializing variables
    var age2= arrayListOf<Int>(1,20,5)
    var name2 =arrayListOf<String>("sandis","ram","shyam");
    name2.add("hari")
    name2.add(4,"sita")
    name2.remove("shyam")
    name2.removeAt(0)

    var mixArrayList = arrayListOf<Any>("hello",5,2.0)

}