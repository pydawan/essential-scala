// 3.3 Companion Objects

// Algumas vezes queremos criar um método que logicamente pertence a uma classe mas
// é independente de um objeto em particular. No Java poderíamos usar um método static para isso mas
// o Scala possui uma solução mais simples: objetos singleton.

// Um uso comum são construtores auxiliares. Embora o Scala possua uma sintaxe que nos permite definir
// múltiplos construtores para uma classe, programadores Scala na maioria das vezes preferem implementar construtores adicionais
// com métodos apply em um objeto com o mesmo nome da classe. Nos referimos a este objeto como companion object (objeto complementar) da classe.

// Com isso, podemos associar funcionalidades ou computações com uma classe sem associá-las com qualquer instância da classe.

// Companion objects substituem métodos static do Java. Fornecem funcionalidade equivalente e são mais flexíveis.

// Um companion object têm o mesmo nome de sua classe associada. Isso não causa um conflito de nomes porque o Scala possui dois namespaces.
// O namespace de valores e o namespace de tipos.

// O companion object deve ser definido no mesmo arquivo da classe associada.

class Timestamp(val seconds: Long)

object Timestamp {
    def apply(hours: Int, minutes: Int, seconds: Int): Timestamp = new Timestamp(hours * 60 * 60 + minutes * 60 + seconds)
}

object TimestampApp {
    def main(args: Array[String]): Unit = {
        println(Timestamp(1, 1, 1).seconds)
    }
}