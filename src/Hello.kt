
fun main(args: Array<String>){
    val cities : MutableList<String> = mutableListOf("Москва", "Мадрид", "Париж");
  println("Добавьте название города и нажмите Enter для просмотра всех добавленных городов")
    val userText: String? = readLine()
    userText.toString()
    if (userText.isNullOrEmpty())
        throw IllegalArgumentException("Значение должно быть введено")
    cities.add("$userText")
       println(cities)
    println("Для просмотра добавленных городов без повторений нажмите Enter.")
    val userText1: String? = readLine()
    userText1.toString()
    println("$userText")
    println("Для выхода из программы нажмите Enter.")
    val userText2: String? = readLine()
    userText2.toString()
}