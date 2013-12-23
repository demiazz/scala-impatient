import java.util.Scanner
import java.io.File
import scala.collection.mutable.HashMap

val in = new Scanner(new File("example.txt"))

val counts = new HashMap[String, Int]

while (in.hasNext()) {
  val word = in.next()

  if (counts.contains(word)) {
    counts(word) += 1
  } else {
    counts(word) = 1
  }
}

for ((word, count) <- counts) println(word + ": " + count)
