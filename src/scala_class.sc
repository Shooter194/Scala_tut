object scala_class {
  // Create the class in scala
  
  case class Student(rollno : Int = 1, name : String = "Annu", marks : Int = 60 )
  {
  	// class methods are created here
  	def show() = println("hiii")
  	def show_more() =
  	{
  		println("hiii")
  		println("show more...")
  	}
  	
  	// this is a operator overloading
  	def >(s2 : Student) : Boolean = marks > s2.marks
  }
  
  
  // create the object of the class
  var stud1 = Student()                           //> stud1  : scala_class.Student = Student(1,Annu,60)
  var stud2 = Student(2,"Rahul",80)               //> stud2  : scala_class.Student = Student(2,Rahul,80)
  
  stud1.show()                                    //> hiii
  stud2.show_more()                               //> hiii
                                                  //| show more...
  
  // call the operator overloading in v=both the way
  stud1.>(stud2)                                  //> res0: Boolean = false
  stud1 > stud2                                   //> res1: Boolean = false
  
  // create the list of student class object
  var studs = List(stud1,stud2, Student(3,"Abhishek",90))
                                                  //> studs  : List[scala_class.Student] = List(Student(1,Annu,60), Student(2,Rahu
                                                  //| l,80), Student(3,Abhishek,90))
  
  // using head method to fetch the first element
  studs.head                                      //> res2: scala_class.Student = Student(1,Annu,60)
  
  // fetch rest element
  studs tail                                      //> res3: List[scala_class.Student] = List(Student(2,Rahul,80), Student(3,Abhish
                                                  //| ek,90))
 
  // filter the value on the basis of marks value
  val topper = studs.filter(s => s.marks> 60)     //> topper  : List[scala_class.Student] = List(Student(2,Rahul,80), Student(3,Ab
                                                  //| hishek,90))
                                                  
  // Partition the object of list based on marks
  val part = studs.partition(s => s.marks > 70)   //> part  : (List[scala_class.Student], List[scala_class.Student]) = (List(Stud
                                                  //| ent(2,Rahul,80), Student(3,Abhishek,90)),List(Student(1,Annu,60)))
                                                  
  // access this partition tuple value
  part._1                                         //> res4: List[scala_class.Student] = List(Student(2,Rahul,80), Student(3,Abhis
                                                  //| hek,90))
  part._2                                         //> res5: List[scala_class.Student] = List(Student(1,Annu,60))
                                                    
  
}