import org.jetbrains.kotlin.resolve.sam.recreateAndInitializeTypeParameters

fun main(args: Array<String>) {
   println("1.Какая часть Света объединяет два материка? Введите номер правильного ответа и нажмите Enter. 1.Евразия 2.Америка")
   val Answer1: Char = '1'
   val userNumber: String? = readLine()
   println("2.Назовите самое глубокое озеро на планете? Введите номер правильного ответа и нажмите Enter. 1.Байкал 2.Титикака")
   val Answer2: Char = '1'
   val userNumber1: String? = readLine()
   println("3.Назовите самую длинную реку Африки? Введите букву номер ответа и нажмите Enter. 1.Нил 2.Конго")
   val Answer3: Char = '1'
   val userNumber2: String? = readLine()
   println("4.Какая из перечисленных мировых столиц не относится к Европе? Введите номер правильного ответа и нажмите Enter. 1.Лусака 2.Скопье")
   val Answer4: Char = '1'
   val userNumber3: String? = readLine()
   println("5.Назовите самую большую по территории страну Африки? Введите номер правильного ответа и нажмите Enter. 1.Алжир 2.Судан")
   val Answer5: Char = '1'
   val userNumber4: String? = readLine()
   when (userNumber) {
      "1" -> println("Ваши знания географии впечатляют!")
      else -> println("Вы не очень хорошо разбираетесь в географии!")
}
}

