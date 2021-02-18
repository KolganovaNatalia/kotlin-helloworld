fun main(args: Array<String>){
    println("Введите имя и нажмите Enter:")
    var userText: String? = readLine()
    var stringText: String = userText.toString()
    print("Приветствую, $stringText")
}