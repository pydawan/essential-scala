// 3.4.5.4 
// O que acontece se definimos um companion object para uma case class?

// Mesmo que tenhamos definido um companion object para uma classe, o gerador de código de case class do Scala
// ainda funciona como esperado - ele acrescenta métodos gerados automaticamente ao objeto que nós definimos,
// por isso precisamos colocar a classe e o companion na mesma unidade de compilação.
// Isso significa que iremos acabar tendo um companion object com o método apply sobrecarregado com duas possíveis assinatures de tipos:

// def apply(name: String): Person
// def apply (firstName: String, lastName: String): Person = 

case class Person(firstName: String, lastName: String) {
    def name = s"$firstName $lastName"
}

object Person {
    def apply(name: String): Person = {
        val parts = name.split(" ")
        apply(parts(0), parts(1))
    }
}