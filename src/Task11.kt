fun main(args: Array<String>){

    /**
     * Read input value converted to demanded type.
     */
    fun <T> input(msg: String, conversion: String.() -> T): T {
        println(msg)
        val value = readLine()
        if (value.isNullOrEmpty())
            throw IllegalArgumentException("Значение должно быть введено")
        return value.conversion()
    }

    val places: Map<Int, String> =
        mapOf(1 to "Иванов Иван Иванович",
              2 to "Петров Петр Петрович",
              3 to "Васильев Василий Васильевич")

    val userByPlace: String? =
        input(
            """
            Для получения информации о том, кто из сотрудников какое рабочее место занимает, нажмите Enter.
            """.trimIndent()) {
            toInt()
        }.let { places[it] }

    if (userByPlace.isNullOrEmpty())
        println("Сотрудник не найден")
    else
        println("Сотрудник $userByPlace")
}
