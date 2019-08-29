// 3.4 Case Classes

// Case classes são um atalho excepcional para definição de classes, objetos complementares (companion objects) e
// a maioria de padrões sensíveis de uma só vez. Eles são ideais para criar classes leves de retenção de dados com o mínimo de problemas.

// 3.4.1 Recursos de uma case class

// 1. Um campo para cada argumento do construtor - não precisamos nem mesmo escrever um val na definição do nosso construtor, embora não haja mal em fazer isso.
// res1: String = Dave

// 2. Um método toString padrão que imprime uma representação sensível ao construtor da classe (sem singais de @ e números hexadecimais).
// res2: Person = Person(Dave, Gurnell)

// 3. Métodos equals e hashCode que operam campos de valor (field values) do objeto.

// Isso facilita o uso de case classes com coleções como Lists, Sets e Maps. Isso também significa que podemos comparar objetos
// com base em seu conteúdo ao invés de sua identidade referencial.

// 4. Um método copy que cria um novo objeto com os mesmos valores de campos que o atual.

// Igualdade de Valor (Value) e Referência (Reference)
// O operador == do Scala é diferente do Java - ele delega para o equals ao invés de comparar valores em sua identidade referencial.
// O Scala têm um operador chamado eq com o mesmo comportamento do == do Java. Entratando, ele é raramente usado no código da aplicação:

// 5. Case classes implementam dois traits: java.io.Serializable e scala.Product.
// Nem são usados ​​diretamente. Este último fornece métodos para inspecionar o número de campos e o nome da case class.

// 3.4.2 Recursos (features) de um companion object (objeto complementar) de uma case class.

// O companion object contém um método apply com os mesmos argumentos que o construtor da classe.
// Programadores Scala tendem a preferir o método apply no lugar do construtor pela brevidade ao omitir new,
// que faz o construtor mais fácil de ler dentro de expressões:

// 3.4.3 Case objects
// Uma observação final. Se você se encontrar definindo uma case class sem parâmetros no construtor então no lugar você pode definir um case object.
// Um case object é definido como um objeto singleton comum mas possui um método toString mais significativo e estende os traits Product e Serializable.

// Case classes são o pão com manteiga dos tipos de dados do Scala. Use as, aprenda-as e amea-as.
// Elas possuem numerosos métodos e recursos gerados automaticamente que poupam digitação. Nós podemos sobrescrever ou redefinir
// esse comportamento parte por parte implementando os métodos relevantes para nós.

// No Scala 2.10 e anteriores nós podiamos definir case classes contendo de 0 a 22 campos. No Scala 2.11 ganhamos a habilidade de definir 
// classes case com tamanho arbitrário.

case class Person(firstName : String, lastName : String) {
    def name = firstName + " " + lastName
}

object CaseClassesApp {
    
    def main (args : Array[String]) : Unit = {
        
        val dave = new Person("Dave", "Gurnell") // we have a class
        // dave: Person = Person(Dave, Gurnell)

        println (dave)
        println (dave.firstName)
        println (dave.lastName)
        println (Person) // and a companion object too
        // res0: Person.type = Person

        println (new Person("Noel", "Welsh").equals(new Person("Noel", "Welsh")))
        // res3: Boolean = true

        println (new Person("Noel", "Welsh") == new Person("Noel", "Welsh"))
        // res4: Boolean = true

        println ( s"Dave: $dave" )
        println ( s"Dave's copy: $dave.copy" )

        println ( dave.copy(firstName = "Dave2") )

        println ( dave.copy(lastName = "Gurnell2") )

        println ( new Person("Noel", "Welsh") eq new Person("Noel", "Welsh") )

        println (dave eq dave)

        println ( Person("Dave", "Gurnell") == Person("Noel", "Welsh") )
        println ( Person("Dave", "Gurnell") == Person("Dave", "Gurnell") )

    }
}