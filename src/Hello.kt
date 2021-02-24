

fun main(args: Array<String>){
    val place: Map<Int, String> = mapOf(1 to "Иванов Иван Иванович", 2 to "Петров Петр Петрович", 3 to "Васильев Василий Васильевич")
    println ("Для получения информации о том, кто из сотрудников какое рабочее место занимает, нажмите Enter.")
    val userText: String? = readLine()
    userText.toString()
   for((key, value) in place){
    println("Рабочее место $key, сотрудник $value")
    }
}





