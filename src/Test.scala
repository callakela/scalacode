

object Test {
  def main(args: Array[String])= 
  {
    print("This is my first scala program>>>"+new Square(10).area())
  }
  val twoElements = ("10", true)
  val threeElements = ("10", "harry", true)
  val request = Message("harry", "sam", "fight")

  println("element>>"+threeElements._2+"---"+request.content+" "+colorCode("orange"))
 def colorCode(color: String): Option[Int] = {
      color match {
      case "red" => Some(1)
      case "blue" => Some(2)
      case "green" => Some(3)
      case _ => None
}
}
val code = colorCode("orange")
    code match {
    case Some(c) => println("code for orange is: " + c)
    case None => println("code not defined for orange")
    }
}