class Counter {
  private var value = Int.MaxValue - 1

  def increment() = if (value < Int.MaxValue) value += 1

  def current = value

  override def toString = "Counter: " + current
}

val counter = new Counter

println(counter)

for (i <- 0 to 2) {
  counter.increment()
  println(counter)
}
