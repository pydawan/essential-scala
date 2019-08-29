// 3.4.3 Case objects
// Uma observação final. Se você se encontrar definindo uma case class sem parâmetros no construtor então no lugar você pode definir um case object.
// Um case object é definido como um objeto singleton comum mas possui um método toString mais significativo e estende os traits Product e Serializable.

case object Citizen {
    def firstName = "John"
    def lastName = "Doe"
    def name = firstName + " " + lastName
}

object CaseObjectApp {
    def main (args : Array[String]) : Unit = {
        println (Citizen.toString)
    }
}