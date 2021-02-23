fun main(args: Array<String>) {
   val table: Array<Array<Any>> = Array( 3, { Array(3, { 0 }) },)
   table[0] = arrayOf("Россия", "Москва", "рубль")
   table[1] = arrayOf("Украина", "Киев", "гривна")
   table[2] = arrayOf("Беларусь", "Минск", "белорусский рубль")
   for(row in table){
      for(cell in row){
         print("$cell \t")
      }
      println()
   }
}