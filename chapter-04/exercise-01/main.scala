val goods = Map("MacBook" -> 120000, "Sony PS4" -> 19000, "Sony Z1" -> 30000)

println("Goods without discount")
for ((good, price) <- goods) println(good + ": " + price)

println("")

val discountedGoods = goods.mapValues((price: Int) => (price * 0.9).toInt)

println("Goods with discount")
for ((good, price) <- discountedGoods) println(good + ": " + price)
