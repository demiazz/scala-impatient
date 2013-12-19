def product(s: String): Long = {
  if (s.length > 0) { s.foldLeft(1L)(_ * _.toLong)
  } else 0
}

println("Product of \"\" is " + product(""))
println("Product of \"Hello\" is " + product("Hello"))
