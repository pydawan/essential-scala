// 3.1.2 Constructors

/*
class Person(first: String, last: String) {
    val firstName = first
    val lastName = last
    def name = firstName + " " + lastName
}
*/

class Person(val firstName: String, val lastName: String) {
    def name = firstName + " " + lastName
}

object Person {
    def main(args: Array[String]): Unit = {
        val dave = new Person("Dave", "Gurnell")
        println(dave)
        println(dave.name)
    }
}