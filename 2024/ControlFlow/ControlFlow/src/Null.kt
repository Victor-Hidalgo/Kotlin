fun main(args: Array<String>){
    var text: String? = null
    text = "This variable is not null."
    val text2: Any = text ?: "The variable is null."

    println(text2)

}