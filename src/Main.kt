
fun main(){
  printFullName("Hello", "Laura")
   remainder(20, 6)
  sum(4,5,7,23)
}
fun printFullName(firstName: String, lastName: String){
    var fullName = firstName+" "+ lastName
    println(fullName)
    statement('I',"am", "smart")
}
fun remainder(num1: Int, num2: Int){
   var result = num1%num2
    println(result)
}
fun sum(num1: Int, num2: Int, num3: Int, num4: Int){
    var result =num1 +num2 +num3 + num4
   println(result)
}
fun statement(firstWord: Char, secondWord: String, lastWord: String){
   var result = firstWord+" "+ secondWord+" "+ lastWord
   println(result)
}

