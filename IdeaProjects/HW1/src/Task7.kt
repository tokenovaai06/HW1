fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage1(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.

fun displayAlertMessage1(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId. "

}
