var a = Array(1, 2, 3, 4, 5)

for (i <- 0 until a.length if ((i % 2 == 0) && (i < a.length - 1))) {
  val buffer = a(i)
  a(i) = a(i + 1)
  a(i + 1) = buffer
}

println(a.mkString(", "))
