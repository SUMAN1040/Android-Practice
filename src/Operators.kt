fun main(args: Array<String>) {
    var x = 5
    val y = 3.0

//    val result = x + y
// here we are doing operations

    /*
    kotlin operator
    */
    println("result is = ${x + y}") //placeholder expression can construct the single value
    println("result is = ${x - y}")
    println("result is = ${x * y}")
    println("result is = ${x / y}")
    println("result is = ${x % y}")


    var result = x + y
    result += 2
    println(result)


    result -= 2
    println(result)

    result *= 2
    println(result)

    result /= 2
    println(result)

    result %= 2
    println(result)

    println("3 + 3 * 4 = ${3 + 3 * 4}")
    println("3 + 3 * 4 = ${(3 + 3) * 4}")

    x = 0
    println("x = ${x++}") //after execution x is 1
    println("x = ${++x}")  //previous 1 and now quickly add 1 then that is 2

    println(x--)
    println(--x)


    val isActive = false
    if (isActive) {
        println("The user is active")
    } else {
        println("The user is not active")
    }

//    if (isActive == false){
//        println("The user is active")
//    }

    val myNumber = 150
    if (myNumber >= 150) {
        println("Greater than 150")
    } else if (myNumber > 90) {
        println("Greater than 90")
    } else {
        println("All the conditions failed")
    }


    val myNumberAgain = 100
    if (myNumberAgain != 150) {
        println("They are not equal")
    } else if (myNumberAgain <= 150) {
        println("Less than or equal to 150")
    } else {
        println("All the conditions failed")
    }


    val isActiveNow = false
    if (!isActiveNow) {
        println("The user is active")
    } else {
        println("The user is not active")
    }


    val isPlaying = true
    val score = 80
    if (isPlaying && score == 100) {
        println("Next level opened")
    } else {
        println("Still at the same level")
    }


    val num1 = 5
    val num2 = -4
    val text/*: String */= if (num1 > 0 || num2 > 0) {
        println("The conditions is true")
        "This is test 1"
    } else {
        println("The condition is false")
        "This is text 2"
    }
    println("Final result = $text")

}