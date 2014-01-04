class Person(name: String) {
  val Array(firstName, lastName) = name.split(' ')
}

val person = new Person("Samurai Jack")

println("First name: " + person.firstName)
println("Last name: " + person.lastName)
