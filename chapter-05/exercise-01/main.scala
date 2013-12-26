class Counter {
  private var value = 0

  def increment() {
    if (value < Int.MaxValue) value += 1
  }

  def current()   = value
}

val counter = new Counter

for (i <- 0 until Int.MaxValue) counter.increment()
for (i <- 0 to 10)           counter.increment()

println("Current value of counter: " + counter.current())
