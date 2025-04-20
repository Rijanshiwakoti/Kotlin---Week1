package com.example.firstclass

fun main() {
    //if-else Statement
    print("Please enter a number : ")
    var number:Any =readln().toInt()
    if(number.toString().toInt() %2==0){
        println("$number is even")
    }
    else{
        println("$number is odd")
    }

//If-Else-if ladder Statement
print("please enter your age :: ")
    var yourAge:Int=readln().toInt()
    if (yourAge<13){
        print("You are a child")
    }else if(yourAge <19){
        print("you are a teenager")
    }else if(yourAge <50){
        print("You are an adult")
    }else{
        print("you are a senior")
    }

//Nested If Statement
println("Please enter 3 numbers")
    var number1:Int=readln().toInt()
    var number2:Int=readln().toInt()
    var number3:Int=readln().toInt()
    var largestNumber:Int = if(number1>=number2){
        if(number1>=number3){
            number1
        }
        else{
            number3
        }
    }else{
        if(number2>=number3){
            number2
        }else{
            number3
        }
    }
    println("The largest number is $largestNumber")

//when Statement
print("Please enter a day number of week: - ")
    var dayNumber:Int = readln().toInt()
    var day: String = when(dayNumber){
        1-> "sunday"
        2-> "monday"
        3-> "tuesday"
        4-> "wednesday"
        5-> "thursday"
        6-> "friday"
        7-> "saturday"
        else -> "Invalid day choice"
    }
    println(day)

//For Loop
for (i in 1..9){
    println(i)
}
    var sum:Int=0
    for(x in 0..5){
        println(x)
        sum +=x
    }
    var vechile = arrayListOf<String>("Tata","Kia","Hyundai","MG")
    for (y in vechile.indices){
        println("The value in $y index is :- ${vechile[y]} ")

    }

//for each loop
    vechile.forEach { println(it) }

//while loop
var i:Int=0;
while(i<5){
    println(i)
    i++
}
    var k =1
    var fact=1
    while (k<6){
        fact*=k
        println("$k! = $fact")
        k++
    }

//Do While loop
var numbers=1
do{
    println(numbers)
    numbers++
}while (numbers <=15)
}