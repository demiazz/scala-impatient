import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.Map

val props: Map[String, String] = System.getProperties()
val maxLength                  = props.keys.maxBy(_.length).length

for ((k, v) <- props) {
  println(k + (" " * (maxLength - k.length + 10)) + " | " + v)
}
