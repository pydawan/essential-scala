case class Pessoa(nome: String, sobrenome: String)

object PatternMatchingApp {

  def identificarPessoa(pessoa: Pessoa): String = pessoa match {
    case Pessoa("Thiago Alexandre", sobrenome) =>
      "Encontrei um Thiago Alexandre!"
    case Pessoa(_, sobrenome) if sobrenome.contains("Roncolato Louly") =>
      "Encontrei um membro da família Roncolato Louly!"
    case _ => "Não conheço essa pessoa!"
  }

  def main(args: Array[String]): Unit = {

    val thiago = Pessoa("Thiago Alexandre", "Martins Monteiro")
    val polyany = Pessoa("Polyany", "Roncolato Louly")
    val lorenzo = Pessoa("Lorenzo", "Roncolato Louly Monteiro")

    // List(thiago, polyany, lorenzo).foreach(pessoa => println(pessoa))
    List(thiago, polyany, lorenzo) foreach println

    println(identificarPessoa(thiago))
    println(identificarPessoa(polyany))
    println(identificarPessoa(lorenzo))

  }
}

