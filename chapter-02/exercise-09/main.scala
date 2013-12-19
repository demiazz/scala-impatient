def product(s: String): Long = {
  if (s.length > 0) { _product(s, 1L)
  } else 0L
}

def _product(s: String, acc: Long): Long = {
  if (s.length > 0) { _product(s.tail, acc * s.head.toLong)
    } else acc
}

println("Product of \"\" is " + product(""))
println("Product of \"Hello\" is " + product("Hello"))

