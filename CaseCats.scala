case class Cat (colour : String, food : String)

object CaseCats {
    def main (args : Array[String]) : Unit = {
        val tom = Cat ("Black", "Milk")
        println (tom)
    }
}