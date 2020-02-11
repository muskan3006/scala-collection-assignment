import com.knoldus.{Driver, Marks, Student}
val percentage1 = Map(1 -> 15, 2 -> 24, 3 -> 45, 4 -> 56, 5 -> 82, 6 -> 52, 7 -> 78, 8 -> 93, 9 -> 95, 10 -> 86)

/*  val a = for{listOfStudents <- Driver.students
              if percentage1(listOfStudents.id) >= 40
              }yield (listOfStudents.name->percentage1(listOfStudents.id))
  println(a)*/

val a = for{listOfStudents <- Driver.students
            if percentage1(listOfStudents.id) >= 40
            }yield (listOfStudents.name->percentage1(listOfStudents.id))
