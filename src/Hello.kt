import java.math.MathContext
import java.math.RoundingMode
import java.math.BigDecimal

fun main(args: Array<String>) {

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

   /**
    * Check input value.
    */
   fun check(msg: String, condition: Boolean) {
      if (!condition)
         throw IllegalArgumentException(msg)
      return
   }

   val SCALE = 2

   val sum: BigDecimal = input("Введите сумму вклада и нажмите Enter") {
      toBigDecimal().setScale(SCALE, RoundingMode.HALF_UP)
   }
   check("Сумма не может быть меньше или равна нулю", sum > BigDecimal.ZERO)

   val month: Int = input("Введите длительность вклада (количество месяцев) и нажмите Enter") {
      toInt()
   }
   check("Количество месяцев не может быть меньше одного", month >= 1)

   val percent: BigDecimal = input("Введите ежемесячный процент по вкладу и нажмите Enter") {
      toBigDecimal().setScale(SCALE, RoundingMode.HALF_UP)
   }
   check("Процент не может быть меньше или равен нулю", percent > BigDecimal.ZERO)


   var previousSum = sum
   println("-----------------------------------------------")
   for (index in 1..month) {
      println("Месяц: $index")

      val overallSum = previousSum * (BigDecimal.ONE + percent / BigDecimal.valueOf(100))
      val incrementSum = overallSum - previousSum
      previousSum = overallSum

      println("Приращение: ${incrementSum.setScale(SCALE, RoundingMode.HALF_UP)}")
      println("Общая сумма: ${overallSum.setScale(SCALE, RoundingMode.HALF_UP)}")
      println("-----------------------------------------------")
   }
}