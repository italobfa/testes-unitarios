fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0
    var i = 0

    while (i < strLower.length){
        if (strLower[i] == 'x') countX++
        else if (strLower[i] == 'o') countO++
        i++
    }
    return countO == countX && countO != 0
}

fun testTrue():Boolean{
    return true
}

fun testNullPoint():Boolean{
    val str: String? = null
    return str!!.length == 0
    //throw NullPointerException()
}


fun main() {
    println(countXO("xoxoxao"))
    testNullPoint()
}