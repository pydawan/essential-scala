class Adder(amount : Int) {
    def add (in : Int) : Int = in + amount
    def apply(in : Int) : Int = in + amount
}

object AdderApp {
    def main (args: Array[String]) : Unit = {
        val add3 = new Adder(3)
        println (add3.apply(2))
        println (add3(4))
    }
}