object BlockApp {
    
    def method = {
        println("This is a side-effect")
        println("This is a side-effect as well")
        3
    }

    def name: String = {
        val title = "Professor"
        val name = "Funkenstein"
        title + " " + name
    }

    def main(args: Array[String]) : Unit = {
        println(method)
        println(name)
    }

}