import java.io.File
import java.util.Scanner
import java.util.TreeMap
import scala.collection.mutable.Map
import scala.collection.JavaConversions.mapAsScalaMap

val in                       = new Scanner(new File("example.txt"))
val counts: Map[String, Int] = new TreeMap[String, Int]

while (in.hasNext) {
  val key = in.next

  counts(key) = if (counts.contains(key)) counts(key) + 1 else 1
}

for ((word, count) <- counts) println(word + ": " + count)
