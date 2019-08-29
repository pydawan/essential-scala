    // Programação Funcional no Scala
    // No Scala, por convenção um objeto pode ser chamado como uma função se ele têm um método apply.
    // Com esse truque simples objetos podem parecer com funções sintaticamente.
    // Com isso temos valores de primeira classe comportando-se como computações pois
    // diferente de métodos objetos podem ser passados como dados.

class Adder(amount: Int) {
    
    def add(in: Int) = in + amount

    def apply(in: Int): Int = in + amount

}

class Counter(val count: Int) {
    
    def dec: Counter = dec()
    def inc: Counter = inc()
    
    def dec(amount: Int = 1) = new Counter(count - amount)
    def inc(amount: Int = 1) = new Counter(count + amount)

    def adjust(adder: Adder) = new Counter(adder.add(count))

}

object CounterApp {
    def main(args: Array[String]): Unit = {
        println(new Counter(10).inc.inc.inc.dec.count)
        println(new Counter(10).adjust(new Adder(5)).count)
        val add3 = new Adder(3)
        println(add3.apply(2))
        println(add3(4))
    }
}