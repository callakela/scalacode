

object EnvironmentVarTest extends App  {
    val environmentVars = System.getenv()
   //for ((k, v) <- environmentVars) println(s"key: $k, value: $v")
    val properties = System.getProperties()
  //for ((k, v) <- properties) println(s"key: $k, value: $v")
}