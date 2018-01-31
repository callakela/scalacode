

object MyObject {
   def main(args: Array[String]) = 
  {
    print("This is my first scala program>>>"+add(10,20))
  }
   
   def add(firstInput: Int, secondInput: Int): Int = {
         val sum = firstInput + secondInput
        return sum
    } 
   
   val code = (10, (x: Int) => x + 100);
   
   print("code>>"+code)
   
   def f(x: Int, y: Int, operator: String): Double = {
         operator match {
          case "+" => x + y
          case "-" => x - y
          case "*" => x * y
          case "/" => x / y.toDouble
}
}
     val sum = f(10,20,"*")
print("sum>>"+sum)

}