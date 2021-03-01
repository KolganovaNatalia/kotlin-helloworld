import kotlin.system.exitProcess

/**
 * List of available actions.
 */
enum class Action(val code: Int, val msg: String) {
    ADD(1, "Добавить название города в программу"),
    SHOW_ALL(2, "Посмотреть в консоли список всех добавленных городов"),
    SHOW_UNIQUE(3, "Посмотреть список добавленных городов без повторений"),
    EXIT(4, "Выход из программы");

    companion object {
        /**
         * Returns action by [code].
         */
        fun findActionByCode(code: Int) = values().first { it.code == code }
    }
}

/**
 * Class container to provide encapsulation.
 */
class Cities {
    private val names = ArrayList<String>()

    /**
     * Extends list of [city] names.
     */
    fun addCity(city: String) = names.add(city)

    /**
     * Returns city names as is.
     */
    fun getCities() = names

    /**
     * Returns only unique city names.
     */
    fun getUniqueCities() = names.toSet()
}

fun main(args: Array<String>) {

    /**
     * Prints exception.
     */
    fun printException(e: Exception) {
        println("Произошла непредвиденная ошибка")
        println("---------------------------------------")
        e.printStackTrace(System.out)
        println("---------------------------------------\n\n")
    }

    /**
     * Returns selected action.
     */
    fun selectAction(): Action {
        while(true) {
            println("Выберите действие:")
            Action.values().forEach { println("${it.code} - ${it.msg}") }

            try {
                return Action.findActionByCode(readLine()!!.toInt())
            } catch (e: Exception) {
                printException(e)
            }
        }
    }

    val title = """
        
         ██████╗██╗████████╗██╗███████╗███████╗
        ██╔════╝██║╚══██╔══╝██║██╔════╝██╔════╝
        ██║     ██║   ██║   ██║█████╗  ███████╗
        ██║     ██║   ██║   ██║██╔══╝  ╚════██║
        ╚██████╗██║   ██║   ██║███████╗███████║
         ╚═════╝╚═╝   ╚═╝   ╚═╝╚══════╝╚══════╝
                                               

    """.trimIndent()
    val delimiter: () -> Unit = { println("---------------------------------------\n\n") }

    val cities = Cities()
    val executableActions = mapOf(
        Action.EXIT to fun() {
            println("Пока пока!")
            exitProcess(0)
        },

        Action.SHOW_ALL to fun() {
            cities.getCities().forEach { println(it) }
            delimiter()
        },

        Action.SHOW_UNIQUE to fun() {
            cities.getUniqueCities().forEach { println(it) }
            delimiter()
        },

        Action.ADD to fun() {
            println("Введите город:")
            readLine().also {
                if (it.isNullOrEmpty())
                    throw IllegalArgumentException("city cannot be empty")
            }?.let { cities.addCity(it) }
            delimiter()
        }
    )

    println(title)
    while(true) {
        val action = selectAction()
        executableActions[action]?.let {
            try {
                it()
            } catch (e: Exception) {
                printException(e)
            }
        }
    }
}
