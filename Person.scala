/*
1.
class Person(first: String, last: String) {
    val firstName = first
    val lastName = last
    def name = firstName + " " + lastName
}
*/

class Person(val firstName: String, val lastName: String) {
    def name = firstName + " " + lastName
    def greet(firstName: String = "Some", lastName: String = "Body") = "Greetings, " + firstName + " " + lastName + "!"
}

// Default and Keyword Parameters
object PersonApp {
    def main(args: Array[String]): Unit = {
        val dave = new Person("Dave", "Gurnell")
        val thiago = new Person(lastName = "Martins Monteiro", firstName = "Thiago Alexandre")
        println(dave.name)
        println(thiago.name)
        println(thiago.greet())
    }
}