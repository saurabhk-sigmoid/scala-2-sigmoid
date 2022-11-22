/**
Write a function which reads a file/stream and group all anagrams together
and print them one by one. (Anagrams means words having the same letters. 
Both Uppercase and lowercase are same)
 **/
// Code:

import scala.collection.mutable.ListBuffer
object find_anagram extends App{
  def Anagram(fileName: String): ListBuffer[ListBuffer[String]] = {
    var words = scala.io.Source.fromFile(fileName).mkString.split("\\s+")
    var sortedList: ListBuffer[String] = ListBuffer()
    var boolean: ListBuffer[Boolean] = ListBuffer()       //created boolean list to not check the visited element again
    for (i <- 0 until words.length) {
      sortedList += (words(i).toLowerCase()).sorted
      boolean += false
    }
    var outputList: ListBuffer[ListBuffer[String]] = ListBuffer()
    for (i <- 0 until words.length) {
      var tempList: ListBuffer[String] = ListBuffer()
      if (boolean(i) == false) {
        for (j <- i + 1 until words.length) {
          if (sortedList(j) == sortedList(i)) {
            tempList += words(j)
            boolean(j) = true
          }
        }
        if (tempList.length != 0) {
          tempList += words(i)
          outputList += tempList
        }
      }
    }
    return outputList
  }
  var anagram = getAnagram("src/main/scala/anagram.txt")
  for (i <- 0 until anagram.length) {
    println(anagram(i))
  }
}
