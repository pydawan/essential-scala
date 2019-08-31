trait Feline {
  def colour: String
  def sound: String
}

trait BigCat extends Feline {
  override val sound = "roar"
}

case class Lion(colour: String, maneSize: Int) extends BigCat

case class Tiger(colour: String) extends BigCat

case class Panther(colour: String) extends BigCat

case class Cat(colour: String, food: String) extends BigCat
