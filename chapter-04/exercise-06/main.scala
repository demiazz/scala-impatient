import java.util.Calendar._
import scala.collection.mutable.LinkedHashMap

val days = LinkedHashMap(
  "Monday"    -> MONDAY,
  "Tuesday"   -> TUESDAY,
  "Wednesday" -> WEDNESDAY,
  "Thursday"  -> THURSDAY,
  "Friday"    -> FRIDAY,
  "Saturday"  -> SATURDAY,
  "Sunday"    -> SUNDAY
)

for ((day, code) <- days) println(day + ": " + code)
