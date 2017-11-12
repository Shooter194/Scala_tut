object Scala_first_wrksht {
  println("Hello World")                          //> Hello World
  
  // Create the variable
  // scala all data type (int,float etc) are class not the data type
  // Here num1 and num2 are objects not variable
  
  var num1 : Int = 7                              //> num1  : Int = 7
  var num2 : Double = 3.5                         //> num2  : Double = 3.5
  
  // Here + is not the operator but its the function that why its functional programming
  println(num1 + num2)                            //> 10.5
  
  // we can alsowrite it like object.function_name() [num1.+(args)]
  println(num1.+(num2))                           //> 10.5
  
  // use the val keyword to create the constant variable in scala
  val const : Int = 7                             //> const  : Int = 7
  // This line show error because its try to change the const value "const = 10"

}