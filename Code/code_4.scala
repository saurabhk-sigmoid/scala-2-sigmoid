
//Question.4.

/**
Write a program that reads words from a file.
Use a mutable,immutable and sorted map respectively to count how often each word appears.
source file: https://www.gutenberg.org/cache/epub/35709/pg35709.txt
 **/

//Code:

import scala.collection.mutable.HashMap
import scala.collection.mutable.SortedMap

object  count extends App {
  def word_count_with_mutable_map(file_name: String): HashMap[String, Int] = {
    var wordCount = HashMap[String, Int]()
    val words = scala.io.Source.fromFile(file_name).mkString.split("\\s+")
    for (word <- words) {
      var count = wordCount.getOrElse(word, 0)
      wordCount(word) = count + 1
    }
    return wordCount
  }

  def word_count_with_immutable_map(file_name: String): Map[String, Int] = {
    var wordCount = Map[String, Int]()
    val words = scala.io.Source.fromFile(file_name).mkString.split("\\s+")
    for (word <- words) {
      var count = wordCount.getOrElse(word, 0)
      wordCount = wordCount + (word -> (count + 1))
    }
    return wordCount
  }

  def word_count_with_sorted_map(file_name: String): SortedMap[String, Int] = {
    var wordCount = SortedMap[String, Int]()
    val words = scala.io.Source.fromFile(file_name).mkString.split("\\s+")
    for (word <- words) {
      var count = wordCount.getOrElse(word, 0)
      wordCount = wordCount + (word -> (count + 1))
    }
    return wordCount
  }
  word_count_with_mutable_map({"src/main/file.txt"}).foreach(println)
  //word_count_with_immutable_map({"src/main/file.txt"}).foreach(println)    //uncomment to run
  //word_count_with_sorted_map({"src/main/file.txt"}).foreach(println)       //uncomment to run
}
