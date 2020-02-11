package com.knoldus

class Ops {
  private val percentage1 = Map(1 -> 15, 2 -> 24, 3 -> 45, 4 -> 56, 5 -> 82, 6 -> 52, 7 -> 78, 8 -> 93, 9 -> 95, 10 -> 86)

  def countPassFail(subjectId: Int, percentage: Int, passFail: String): List[Object] = {
    if (percentage <= 100 && passFail.toLowerCase == "pass" || passFail.toLowerCase == "fail") {
      if (passFail.toLowerCase == "fail") for {listOfMarks <- Driver.marks; listOfStudents <- Driver.students
                                               if listOfMarks.subjectId == subjectId && listOfMarks.marksObtained < percentage && listOfMarks.studentId == listOfStudents.id
                                               } yield listOfStudents else {
        for {listOfMarks <- Driver.marks; listOfStudents <- Driver.students
             if listOfMarks.subjectId == subjectId && listOfMarks.marksObtained > percentage && listOfMarks.studentId == listOfStudents.id
             } yield listOfStudents.name

      }
    } else throw new Exception("Not possible")
  }

  def studentsAbove95(): List[(String, Int)] = {
    for {listOfStudents <- Driver.students
         if percentage1(listOfStudents.id) >= 95
         } yield (listOfStudents.name, percentage1(listOfStudents.id))

  }

  def scholarship(percentage: Double, good_scholarship: Int, normal_or_no_scholarship: Int): (List[(String, Int)], List[(String, Int)]) = {
    if (percentage <= 100) {
      val goodScholarsip =goodScholarship(percentage,good_scholarship)
      val normalScholarship =normalOrNoScholarship(percentage,normal_or_no_scholarship)
      (goodScholarsip,normalScholarship)
    } else throw new Exception("Not possible")

  }

  private def goodScholarship (percentage: Double, good_scholarship: Int) = {
    for {
      listOfStudents <- Driver.students
      if percentage1 (listOfStudents.id) >= percentage
    } yield (listOfStudents.name, good_scholarship)
  }

  private def normalOrNoScholarship(percentage: Double, normal_or_no_scholarship: Int)={
    for {listOfStudents <- Driver.students
         if percentage1(listOfStudents.id) < percentage
         } yield (listOfStudents.name, normal_or_no_scholarship)
  }

  def passFailPercentage(passFail:String,percentage:Double): List[(String, Int)] ={
    if(percentage <= 100 && passFail.toLowerCase == "pass" || passFail.toLowerCase == "fail"){
      if(passFail.toLowerCase == "fail"){
        for{listOfStudents <- Driver.students
            if percentage1(listOfStudents.id)<percentage
            }yield (listOfStudents.name,percentage1(listOfStudents.id))
      } else {
        for{listOfStudents <- Driver.students
            if percentage1(listOfStudents.id)>=percentage
            }yield (listOfStudents.name,percentage1(listOfStudents.id))
      }
    } else throw new Exception("Not possible")
  }

  def topBottomCount(count:Int,topBottom:String): List[(String, Float)] ={
    val list = Driver.marks.sortBy(_.marksObtained)
   val n:List[Marks]= if(topBottom.toLowerCase()=="top") {
     list.reverse.take(count)
   } else list.take(count)
    println(n)
    for{listOfMarks <- n; listOfStudents<-Driver.students
        if listOfMarks.studentId == listOfStudents.id
        }yield (listOfStudents.name,listOfMarks.marksObtained)
  }

  def reportCard()={
    val list = Driver.marks.groupBy(_.studentId)

  }


}




object a extends App {
  val o = new Ops
//  println(o.countPassFail(2, 70, "Fail"))
//  println(o.studentsAbove95())
//  println(o.scholarship(56.5, 2000, 500))
//  println(o.passFailPercentage("Pass",85))
  println(o.topBottomCount(5,"top"))
  o.reportCard()
}
