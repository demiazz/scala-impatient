import java.util.Scanner
import java.io.File
import scala.collection.immutable.SortedMap

val in     = new Scanner(new File("example.txt"))
var counts = SortedMap[String, Int]() withDefault (_ => 0)

while (in hasNext) {
  val key          = in next
  val currentCount = counts(key)

  counts = counts - key + (key -> (currentCount + 1))
}

for ((word, count) <- counts) println(word + ": " + count)
