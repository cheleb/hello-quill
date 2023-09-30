package helloquilll

import io.getquill._
import java.util.UUID

object MyApp {
  case class Person(id: UUID, firstname: String, lastname: String, age: Int)
  case class Course(id: Long, name: String)
  case class Person_x_course(person_id: UUID, course_id: Int)

  // SnakeCase turns firstName -> first_name
  val ctx = new PostgresJdbcContext(SnakeCase, "ctx")
  import ctx._

  def main(args: Array[String]): Unit = {

    val named = "Agnès"
    inline def somePeople = quote {
      for {
        person <- query[Person].withFilter(p => p.firstname == lift(named))
        pXc <- query[Person_x_course].leftJoin(pc => pc.person_id == person.id)
//        course <- query[Course].leftJoin(co => co.id == pXc.course_id)
      } yield person
    }
    val people = run(somePeople)
    // TODO Get SQL
    println(people)
  }
}
