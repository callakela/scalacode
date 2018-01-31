

class Square(length: Int) extends Shape {
  def area = length * length
  
  def main(args: Array[String]) = 
  {
    print("This is my first scala program>>>"+new Square(10).area)
  }
}

 