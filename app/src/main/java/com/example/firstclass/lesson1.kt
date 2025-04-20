package com.example.firstclass

fun main(){
    //types of variable
    //mutable
var age=19;
    age=10;

    //immutable
    val roll=10;
//    roll=11;
    //cannot reassign value
    var a: Boolean=true
    var b:Char='R'
    var c:Byte=12
    var d: Short=-356
    var e:Int=43543
    var f:Long=-51321354L
    var i: Float=5.6451344F
    var h: Double=7.32644564
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)
    //Type conversion
    var x: Double=132.321;
    var y:Int=x.toInt()
    var z: Byte=y.toByte()
    println(x)
    println(y)
    println(z)
}