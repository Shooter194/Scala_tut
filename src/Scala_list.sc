
object Scala_list {
  
  
  // create the Int list because all element is integer
  var lst = List(1,2,3,4)                         //> lst  : List[Int] = List(1, 2, 3, 4)
  
  // create the AnyVal type list because parent class of the boolean and int is AnyVal check the pic in type-pic
  var lst1 = List(1,2,3,true)                     //> lst1  : List[AnyVal] = List(1, 2, 3, true)
  
  // create the Any type list because parent class of the string and int is Any check the pic in type-pic
  var lst2 = List(1,2,3,4,"Annu")                 //> lst2  : List[Any] = List(1, 2, 3, 4, Annu)
  
  // traverse the list with for each loop method as java
  for (i <- lst1) println(i)                      //> 1
                                                  //| 2
                                                  //| 3
                                                  //| true
  
  // traverse the list with using Lambda expression
  lst1.foreach { i => println(i) }                //> 1
                                                  //| 2
                                                  //| 3
                                                  //| true
                                                  
  // reverse the list using reverse method and this method is not change the existing list but create the new one for that reverse list to maintain the concurrency
  lst1.reverse                                    //> res0: List[AnyVal] = List(true, 3, 2, 1)
  
  for (i <- lst1) println(i)                      //> 1
                                                  //| 2
                                                  //| 3
                                                  //| true
  
  // remove the first two element from list and create the new list
  lst1.drop(2) // also write "lst1 drop(2)"       //> res1: List[AnyVal] = List(3, true)
  
  // remove two element and take the just next element
  lst1.drop(2).take(1)                            //> res2: List[AnyVal] = List(3)
}