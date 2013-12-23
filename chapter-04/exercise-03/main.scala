import java.util.Scanner
import java.io.File
import scala.collection.immutable.HashMap

val in = new Scanner(new File("example.txt"))

var counts = new HashMap[String, Int]

while (in.hasNext()) {
  val word = in.next()

  if (counts.contains(word)) {
    counts = counts + (word -> (counts(word) + 1))
  } else {
    counts = counts + (word -> 1)
  }
}

for ((word, count) <- counts) println(word + ": " + count)
