// 3.1.3 Default and Keyword Parameters

class Person(val firstName: String, val lastName: String) {
    
    def name = firstName + " " + lastName

    def greet(firstName: String = "Some", lastName: String = "Body") = "Greetings, " + firstName + " " + lastName + "!"

}

object Person {
    def main(args: Array[String]): Unit = {
        println(new Person("Dave", "Gurnell").firstName)
    }
}