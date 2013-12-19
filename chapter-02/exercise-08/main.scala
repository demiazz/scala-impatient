def product(s: String): Long = s.foldLeft(1L)(_ * _.toLong)

println("Product of \"\" is " + product(""))
println("Product of \"Hello\" is " + product("Hello"))
