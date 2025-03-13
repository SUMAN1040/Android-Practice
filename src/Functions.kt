fun main(args: Array<String>) {

// to call a function
//    sayHello("Suman", 21)
//
//    val hasInternetConnection = true
//    if (hasInternetConnection){
//        getData(1)
//    }else{
//        showMassage()
//    }
//}
//
//fun sayHello(name: String, age: Int) {
//    var number = age
//    number = 22
//
//    println("Hello $name! your age is $age")
//}
//
//fun getData(Data:Any){
//    println("Your data is: $Data mb/sec")
//}
//
//fun showMassage(){
//    println("There's no internate connection")


    //To return a function
//    val max = getMarks(5, 9)
//    println(max)


//Function Overloading
//    val max = getMarks(5, 911, 10)
//    println(max)


    //sendMessage()


    
    println( "The sum of this numbers: ${sum(5, 5, 8, 3, 3, 4, 34)}")
}

//fun getMarks(a: Int, b: Int): Int {
////    val max = if (a > b) a else b
////    println("Some text")
////    return max
//
//    return if (a > b) a else b
//}

//fun getMarks(a: Int, b: Int): Int = if (a > b) a else b


//fun getMarks(a: Double, b: Double) = if (a > b) a else b
//
//fun getMarks(a: Int, b: Int, c:Int): Int{
//    return if (a >= b && a >= c) {
//        a
//    }else if (b >= a && b >= c){
//        b
//    }else {
//        c
//    }
//}


//fun sendMessage(name:String = "User", message: String = sendText()){
//    println("Name: $name and Message $message")
//
//}


//fun sendText() = "Some text"


fun sum(vararg  numbers: Int): Int {
    var result = 0
    for (number in numbers){
        result += number
    }

    numbers.forEach { println(it) }
    return result
}