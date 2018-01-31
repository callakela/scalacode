

object sumInput {
  
  def main(args: Array[String]) = 
  {
    print("This is my first scala program>>> "+add("1","hi"))
  }
  
  def add(firstInput: String, secondInput: String): String = {
       val isNum1st= new OpsNum(firstInput).isNumeric && firstInput!=null;
       val isNum2nd= new OpsNum(secondInput).isNumeric && secondInput!=null;
          if(!(isNum1st && isNum2nd))
               return "Not an number";
          
         val sum = firstInput.toInt + secondInput.toInt
        return sum.toString();
    }  
  
 
  class OpsNum(val str: String) extends AnyVal {
  def isNumeric() = scala.util.Try(str.toDouble).isSuccess
}
}