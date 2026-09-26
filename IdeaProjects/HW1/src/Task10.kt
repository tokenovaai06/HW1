fun main() {

    println(comparedTime(300, 250))
    println(comparedTime(300, 300))
    println(comparedTime(200, 220))

}
fun comparedTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean{

    return timeSpentToday > timeSpentYesterday

}