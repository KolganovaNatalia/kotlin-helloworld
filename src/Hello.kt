fun main(args: Array<String>){
   println("Введите число a и нажмите Enter")
   var a = readLine()!!.toInt()
   println("Введите число b и нажмите Enter")
   var b = readLine()!!.toInt()
   println("a=$a b=$b")
   println("$a" > "$b")

}