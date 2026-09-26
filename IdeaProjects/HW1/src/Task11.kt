fun main(){
    println(weatherCity("Ankara",27 ,31 ,82))
    println(weatherCity("Tokyo",32 ,36 ,10))
    println(weatherCity("Cape Town",58 ,64 ,2))
    println(weatherCity("Guatemala Cityn",50 ,55 ,7))

    println()
}
fun weatherCity(cityName: String, lowT: Int, highT: Int, chansR: Int): String{
    return "City: $cityName\nLow temperature: $lowT\nHigh temperature: $highT\nChance of rain: $chansR%\n"
}