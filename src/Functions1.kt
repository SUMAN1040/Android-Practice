fun main(Args:Array<String>){
    println(sum(1,2,3,4,5))
}


fun math(vararg numbers:Int):Int{
    var result = 0
    for (number in numbers){
        result += number
    }
    return result
}

