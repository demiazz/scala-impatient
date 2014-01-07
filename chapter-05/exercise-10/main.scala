class Employee(val name: String = "John Q. Public", var salary: Double = 0.0) {

  override def toString = name + " - $" + salary

}

val defaultEmployee = new Employee
val customEmployee  = new Employee("John Due", 10000.0)

println(defaultEmployee)
println(customEmployee)
