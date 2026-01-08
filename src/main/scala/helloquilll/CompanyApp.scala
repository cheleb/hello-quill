package helloquilll

import zio.ZIOAppDefault
import io.getquill._

final case class Companies(
    id: Long,
    slug: String,
    name: String,
    url: String,
    location: Option[String] = None,
    country: Option[String] = None,
    industry: Option[String] = None,
    image: Option[String] = None,
    tags: List[String] = List.empty
)

object CompanyApp extends App {
  val ctx = new PostgresJdbcContext(SnakeCase, "ctx")
  import ctx._

  inline def somePeople = quote {
    query[Companies]
      .filter(c => c.id == 2)
      .concatMap(_.tags)
      .filter(tag => tag == "tag1")
    // .nonEmpty
//          liftQuery
//        course <- query[Course].leftJoin(co => co.id == pXc.course_id)

  }
  val people = run(somePeople)
  // TODO Get SQL
  println(people)
}
