fun main(args: Array<String>){
    val alarm = 7

//    val text = when(alarm){
//        in 1..10 -> {
//            println("The number is in the range 1...10")
//        }
//        12, 7, 14 -> {
//            println("Some text")
//            "The time is $alarm"
//        }
//
////        7 -> println("The time is $alarm")
////        14 -> println("The time is $alarm")
//        else -> {
//            "The time is $alarm"
//        }
//    }


    val text = when {
        alarm <= 10 -> "The number is range 1..10"
        alarm == 8 || alarm == 7 -> "The time is$alarm"
        else -> "The time is $alarm"
    }
    println(text)
}