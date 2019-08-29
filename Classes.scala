// 31.1 Defining a Class

class Person {
    val firstName = "Noel"
    val lastName = "Welsh"
    def name = firstName + " " + lastName
}

object Person {
    def main(args: Array[String]): Unit = {
        val noel = new Person
        println(noel.name)
    }
}