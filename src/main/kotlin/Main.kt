fun main(){
    year(2024)


    word("AkiraChix")
    var k = detail("Brian", 34, "Kitale")
    println(k)


    var h = average(30,30,30)
    println(h)

    words("Circle", "Oval", "Rectangle", "Square")


}

//9. Write a Kotlin program to check if a given year is a leap year.
fun year(y:Int){
    if(y % 4 == 0)
        println("leapYear")
    else{println("Not leap year")}



}

//Write a Kotlin function that reverses a given string.
fun word(name:String){
    println(name.reversed())
}

//Write a Kotlin function that takes named arguments 'name', 'age', and 'city' and prints the details of a person.
fun detail(x:String, y:Int, z:String):String{
    var statement = "My name is $x and I am $y years old from $z"
    return statement
}
//Write a program that calculates the average of three numbers. The user should be prompted to enter the three numbers.
fun average(num1:Int, num2:Int, num3:Int):Int{
    var result = (num1 + num2 + num3) / 3
    return result
}

//create a function that takes in 4 strings and creates an array out of them then prints out the array
fun words(word1:String, word2:String, word3:String, word4:String){
    var x = arrayOf(word1, word2, word3, word4)
    println(x.contentToString())
}


