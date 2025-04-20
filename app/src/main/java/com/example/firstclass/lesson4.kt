package com.example.firstclass

fun main() {
//Arithmetic Operations

    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result= num1 * num2
    println("num1 * num2 is $result")
    result= num1 / num2
    println("num1 / num2 is $result")
    result =num1 % num2
    println("num1 % num2 is $result")

    //Assignment Operators

    var x:Int = 20
    var y:Int = 10
    var z:Int = 0
    z = x+y
    println("z = x + y = $z")
    z += x
    println("z += x = $z")
    z -= x
    println("z -= X =$z")
    z *= x
    println("z = x = $z")
    z /= x
    println("z /= x = $z")
    z %= z
    println("z %= x = $z")

//Unary Operator

    var a: Int = 5
    var b:Int = 5
    println("a == b :" +(a == b))
    println("a != b :" +(a!=b))
    println("a < b :" +(a<b))
    println("a > b :" +(a>b))
    println("a >= b :" +(a>=b))
    println("a <= b :" +(a<=b))

//Conditional Operators

    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12
    var result1: Boolean = false;
//conditional operator (&&)
    result1= (number1 > number2) && (number3 > number2)
    println(result1)
//conditional operator (ID)
    result1 = (number1 > number2) || (number3 > number2)
    println(result1)

//Operator Precedence
    var result2:Int=5+2*4
    println("Result ="+result2)
    result2=(5+2)*4
    println("Result ="+result2)
    var X:Int=8;
    var Y:Int=4;
    var Z:Int=2;
    var sum:Int = 0
    sum=X+ --Y+ --Z
    println("x+ ---y + --z ::: $sum")

//rangeTo and "in" Operator
var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'..'j'

    var check ='Z' in testCharRange
    println("mycharRange has Z: $check")
    println(myCharRange)
    println(testCharRange)


}