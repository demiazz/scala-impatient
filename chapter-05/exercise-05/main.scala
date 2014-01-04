import scala.reflect.BeanProperty

class Student(@BeanProperty var id: Long, @BeanProperty var name: String)

val student = new Student(10, "Bob")

println(student.id + " - " + student.name)
println(student.getId + " - " + student.getName)

student.id = 20
student.name = "Sam"

println(student.id + " - " + student.name)

student.setId(30)
student.setName("Harry")

println(student.getId + " - " + student.getName)
