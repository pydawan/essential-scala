case class Cat(name: String, colour: String, food: String)

/*
object ChipShop {
  def willServe(cat: Cat): Boolean = {
    cat match {
      case Cat(???, ???, ???) => ???
    }
  }
}
 */

object ChipShop {
  def willServe(cat: Cat): Boolean = {
    cat match {
      case Cat(_, _, "Chips") => true
      case Cat(_, _, _)       => false
    }
  }
}

object ChipShopApp {
  def main(args: Array[String]): Unit = {
    println(ChipShop.willServe(Cat("Tom", "Black", "Chips")))
    println(ChipShop.willServe(Cat("Alonzo", "White", "Milk")))
  }
}
