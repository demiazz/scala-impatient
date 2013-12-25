import java.util.Scanner
import java.io.File
import scala.collection.mutable.Map

val in     = new Scanner(new File("example.txt"))
val counts = Map[String, Int]() withDefault (_ => 0)

while (in hasNext) counts(in next) += 1

for ((word, count) <- counts) println(word + ": " + count)
