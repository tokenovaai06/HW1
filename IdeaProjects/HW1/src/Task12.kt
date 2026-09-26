fun main(){
    println(weatherCity12("Ankara",27 ,31 ,82))
    println(weatherCity12("Tokyo",32 ,36 ,10))
    println(weatherCity12("Cape Town",58 ,64 ,2))
    println(weatherCity12("Guatemala Cityn",50 ,55 ,7))

    println()
}
    fun weatherCity12(cityName: String, lowT: Int, highT: Int, chansR: Int): String{
        return "City: $cityName\nLow temperature: $lowT\nHigh temperature: $highT\nChance of rain: $chansR%\n"
}