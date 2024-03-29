import java.util.Date

trait Visitor {
  def id: String
  def createdAt: Date

  def age: Long = new Date().getTime - createdAt.getTime
}

case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor

case class User(id: String, email: String, createdAt: Date = new Date())
    extends Visitor

object TraitsApp {

  def older(v1: Visitor, v2: Visitor): Boolean =
    v1.createdAt.before(v2.createdAt)

  def main(args: Array[String]): Unit = {
    println(older(Anonymous("1"), User("2", "test@example.com")))
  }
}
