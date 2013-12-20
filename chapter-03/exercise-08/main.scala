import collection.mutable.ArrayBuffer

// Original solution

def positiveIndexes(a: ArrayBuffer[Int]) = {
  val indexes = new ArrayBuffer[Int]

  var first = true
  for (i <- 0 until a.length if first || a(i) >= 0) {
    if (a(i) < 0) first = false

    indexes.append(i)
  }

  indexes
}

def original(a: ArrayBuffer[Int]) {
  val indexes = positiveIndexes(a)

  for (i <- 0 until indexes.length) a(i) = a(indexes(i))

  a.trimEnd(a.length - indexes.length)
}

// Custom solution

def negativeIndexes(a: ArrayBuffer[Int]) = {
  val indexes = new ArrayBuffer[Int]

  for (i <- 0 until a.length if a(i) < 0) {
    indexes.append(i)
  }

  indexes
}

def alternate(a: ArrayBuffer[Int]) = {
  var indexes = negativeIndexes(a).reverse

  indexes.trimEnd(1)

  for (i <- 0 until indexes.length) {
    a.remove(indexes(i))
  }
}

// Test

def testAlgorithms = {
  val a = ArrayBuffer(1, 4, -3, 5, 2, -4, 5, 9, -9, 4, -5, -6, 2)
  val b = ArrayBuffer(1, 4, -3, 5, 2, -4, 5, 9, -9, 4, -5, -6, 2)

  original(a)
  alternate(b)

  println(a.mkString(", "))
  println(b.mkString(", "))
}

testAlgorithms

// Benchmark

var now = System.nanoTime

for (i <- 0 to 1000000) {
  val a = ArrayBuffer(1, 4, -3, 5, 2, -4, 5, 9, -9, 4, -5, -6, 2)

  original(a)
}

println("Original: %d microseconds".format((System.nanoTime - now) / 1000))

now = System.nanoTime

for (i <- 0 to 1000000) {
  val b = ArrayBuffer(1, 4, -3, 5, 2, -4, 5, 9, -9, 4, -5, -6, 2)

  alternate(b)
}

println("Alternate: %d microseconds".format((System.nanoTime - now) / 1000))
