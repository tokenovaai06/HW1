

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)


    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val subsResult = substract(firstNumber, secondNumber)
    val subsAnotherResult = substract(firstNumber, thirdNumber)


    println("$firstNumber - $secondNumber = $subsResult")
    println("$firstNumber - $thirdNumber = $subsAnotherResult")
}

// Define add() function below this line
fun add(a: Int, b: Int ): Int{
    return a + b

}
fun substract(a: Int, b: Int ): Int{
    return a - b

}
