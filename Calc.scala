object calc {
    def square(x: Double) : Double = {
        return x * x
    }

    // ??? é semelhante ao pass do Python para criar um bloco de código vazio.
    def cube(in: Double) : Double = ???

}

object CalcApp {
    def main(args: Array[String]) : Unit = {
        assert(calc.square(2.0) == 4.0)
    }
}
