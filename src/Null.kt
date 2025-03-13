fun main(args: Array<String>) {
    var text: String? = null


//    text = null
//    if (text != null ){
//        println(text.length)
//    }else{
//        println("The variable is null")
//    }


    //text = "Android Developer"

//    text = "This variable is not null"
//    val text2: Any = text ?: "Android Developer
    var text2 = ""

    if (text != null) {
        text2 = text
    } else {
        text2 = "This variable is null"
    }
    println(text2)

//safe-call operator { ? }


}