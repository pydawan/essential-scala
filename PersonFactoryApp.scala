class Person(val firstName: String, val lastName: String) {
    def name: String = s"$firstName $lastName"
}

object Person {
    def apply(name: String): Person = {
        val parts = name.split(" ")
        new Person(parts(0), parts(1))
    }
}

object PersonFactoryApp { 
    def main(args: Array[String]): Unit = {
        println(Person.apply("Thiago Monteiro").firstName)
        println(Person("Thiago Monteiro").firstName)
    }
}