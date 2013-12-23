import java.util.TimeZone.getAvailableIDs

var sortedIDs: Array[String] = getAvailableIDs.map(_.split('/').last).sorted

for (city <- sortedIDs) println(city)
