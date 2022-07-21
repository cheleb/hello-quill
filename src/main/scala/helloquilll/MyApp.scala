package helloquilll

import io.getquill._

object MyApp {
  case class Person(firstname: String, lastname: String, age: Int)

  // SnakeCase turns firstName -> first_name
  val ctx = new PostgresJdbcContext(SnakeCase, "ctx")
  import ctx._

  def main(args: Array[String]): Unit = {
    val named = "Agnès"
    inline def somePeople = quote {
      query[Person].filter(p => p.firstname == lift(named))
    }
    val people = run(somePeople)
    // TODO Get SQL
    println(people)
  }
}