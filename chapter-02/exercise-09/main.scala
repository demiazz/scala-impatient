def product(s: String): Long = {
  if (s.length > 0) {
    product(s.tail) * s.head.toLong
  } else 1
}

println("Product of \"\" is " + product(""))
println("Product of \"Hello\" is " + product("Hello"))

