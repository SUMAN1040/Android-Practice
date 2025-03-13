fun main(){
    var name: String = "InnoX"  // kotlin has type inference, that mean that not to specify all type value whatever we use
    val age: Int = 21

    var number: Int = 25

    val maxIntegervalue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
//    println(name)
    println("Int maximum value is: $maxIntegervalue")
    println("Int minimum value is: $minIntegerValue")


    number = 2147483647  //Bcoz this variable is stored the whole number, that can not to be use greater this

    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE
    println("Byte maximum value is: $myMaxByteValue")
    println("Byte minimum value is: $myMinByteValue")


    val myMaxShortValue: Short = Short.MAX_VALUE
    val myMinShortValue: Short = Short.MIN_VALUE
    println("Short maximum value is: $myMaxShortValue")
    println("Short minimum value is: $myMinShortValue")


    val myMaxLongValue: Long = Long.MAX_VALUE
    val myMinLongValue: Long = Long.MIN_VALUE
    println("Long maximum value is $myMaxLongValue")
    println("Long minimum value is $myMinLongValue")

    val myNumber = 288888888888

    //byte 8bits  short 16bits  int 32bits

}