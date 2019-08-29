case class Counter(count: Int = 0) {
    def dec = copy(count = count - 1)
    def inc = copy(count = count + 1)
}