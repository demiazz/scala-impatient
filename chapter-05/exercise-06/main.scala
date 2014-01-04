class Person(val name: String, ageParam: Int) {
  val age: Int = if (ageParam > 0) ageParam else 0
}

val jack = new Person("Captain Jack", -5)

println(jack.name + " - " + jack.age + " years old")

val kirk = new Person("Captain Kirk", 20)

println(kirk.name + " - " + kirk.age + " years old")
