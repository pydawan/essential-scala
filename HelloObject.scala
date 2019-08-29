object Oswald {
    val color: String = "Black"
    val food: String = "Milk"
}

object Henderson {
    val color: String = "Ginger"
    val food: String = "Chips"
}

object Quentin {
    val color: String = "Tabyy and white"
    val food: String = "Curry"
}

object HelloObject {
    def main(args: Array[String]): Unit = {
        println(Oswald)
        println(Oswald.color)
        println(Oswald.food)
    }
}