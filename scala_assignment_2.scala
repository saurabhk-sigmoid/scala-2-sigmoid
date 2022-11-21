//Question.1.a.
/**
Write a function minmax(values: Array[Int])
that returns a pair containing the smallest
and largest values in the array.

**/
 //Code:

object MinMaxFinder extends App{
  def minmax(values: Array[Int]): List[Int] = {
    try {
      if (values.isEmpty) {
        throw new NoSuchElementException("Exception: Given list is empty")
      }
      else {
        var list = List(values.min, values.max)
        return list
      }
    }
    catch {
      case error => println(error.getMessage)
        return List()
    }

  }
  println("Enter size of array: ")
  var size = scala.io.StdIn.readInt()
  val myList = new Array[Int](size)
  println("Enter the elements of array is: ")

  for (i <- 0 to size - 1) {
    myList(i) = scala.io.StdIn.readInt()
  }

  println(minmax(myList))
}


//Question.1.b

/**
.Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing
the counts of values less than v, equal to v, and greater than v.
 */

//Code:
object lt_eg_gt extends App {
  def lteqgt(values: Array[Int], v: Int): Array[Int] = {
    try {
      if (values.isEmpty) {
        throw new NoSuchElementException("Exception: Given list is empty")
      }
      else {
        var triplet: Array[Int] = Array(0, 0, 0)
        for (i <- 0 until values.length) {
          if (values(i) < v) {
            triplet(0) += 1
          }
          else if (values(i) == v) {
            triplet(1) += 1
          }
          else if (values(i) > v) {
            triplet(2) += 1
          }
        }
        return triplet
      }
    }
    catch {
      case error => println(error.getMessage)
        return Array()
    }

  }
  println("Enter size of array: ")
  var size = scala.io.StdIn.readInt()
  val myList = new Array[Int](size)
  println("Enter the values of array is: ")

  for (i <- 0 to size - 1) {
    myList(i) = scala.io.StdIn.readInt()
  }
  println("Enter the element to find triplets: ")
  var element = scala.io.StdIn.readInt()

  lteqgt(myList,element).foreach(println)
}

//Question.2.

/**
Given an array of integers, produce a new array that contains all
positive values of the original array, in their original order,
followed by all values that are zero or negative, in their original order.

**/

//Code:

import scala.collection.mutable.ArrayBuffer
object postive_order extends App {

    def positive_first(values: ArrayBuffer[Int]) :ArrayBuffer[Int]= {
        try {
          if (values.isEmpty) {
            throw new NoSuchElementException("Exception: Given list is empty")
          }
          else {
            var positive = new ArrayBuffer[Int]
            var others = new ArrayBuffer[Int]

            for (i <- 0 until values.length) {
              if (values(i) > 0) {
                positive+=values(i)
              }
              else
                others+=values(i)

            }

           return ArrayBuffer.concat(positive, others)
          }
        }
        catch {
          case error => println(error.getMessage)
            return ArrayBuffer()
        }

      }


      println("Enter size of array: ")
      var size = scala.io.StdIn.readInt()
      val myList = new ArrayBuffer[Int]
      println("Enter the elements of array is: ")

      for (i <- 0 to size-1) {
      var x = scala.io.StdIn.readInt()
        myList.append(x)
   }
println(positive_first(myList))
}


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
//  word_count_with_mutable_map({"src/main/file.txt"}).foreach(println)
//  word_count_with_immutable_map({"src/main/file.txt"}).foreach(println)
//  word_count_with_sorted_map({"src/main/file.txt"}).foreach(println)
}

//Question.5.

/**
Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.
T\Provide a general superclass UnitConversion and define objects InchesToCentimeters,GallonsToLiters,
and MilesToKilometers that extend it.

**/

//Code:

object converter extends App {
  class UnitConversion(val conversionFactor: Double) {
    private def convert(value: Double) = value * conversionFactor

    def apply(value: Double) = convert(value)
  }

  print("Enter number to convert: ")
  var x = scala.io.StdIn.readInt()
  object InchesToCentimeters extends UnitConversion(2.54) {}
  println("conversion from inches to centimeters is : "+InchesToCentimeters(x))

  object GallonsToLiters extends UnitConversion(3.78541) {}
  println("conversion from Gallons to Litres is : "+GallonsToLiters(x))

  object MilesToKilometers extends UnitConversion(1.60934) {}
  println("conversion from Miles to Kilometers is : "+MilesToKilometers(x))

}


//Question.6.
/**
Write a Scala application, using the App trait, that prints the command-line arguments
in reverse order, separated by spaces. For example, scala Reverse Hello World
should print World Hello. (Use scalac and scala command)
**/

//Code:

object Reverse extends App {
  var a="Hello world"
  for (s <- a.reverse)
    print(s)
  println
}



//Question.7 and 8.
/**
Create a MYSQL schema having a table city with columns: id, name, population,link;
 where id is a serial number which is unique to a record(this can't be null), name is a string
 representing name of the city(this can't be null) and population an integer(this can't be null)
 and link as a web link to the city. Add some random records.
 Write a function to connect to the above DB and fetch all records as a list of city.
 (Hint: Use a table city, create a case class of city and fetch all records.Use mysql-connector-java library)

8.After fetching all records of city to a list of class City, write it to a file and read it through spark as a df.
 */

//Code:


import java.io.{FileWriter}
import java.sql.DriverManager
import org.apache.spark.sql.SparkSession
object db extends App {

  var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh?user=root&password=saurabh@07")
  // connecting to mysql

  connection.nativeSQL("show databases")

  var statement = connection.createStatement

  // creating table
  statement.executeUpdate("CREATE TABLE IF NOT EXISTS city" +
    "(\n" +
    "id int(10) not NULL,\n" +
    "name varchar(25) not NULL,\n" +
    "population int(10) not NULL,\n" +
    "link varchar(50),\n" +
    "PRIMARY KEY (id)\n" +
    ");")

  // Inserting data to table
  statement.executeUpdate("INSERT INTO city VALUES (1,'uttarakhand',2636635,'www.uk.com');")
  statement.executeUpdate("INSERT INTO city VALUES (2,'serbia',378435,'www.serbia.com');")
  statement.executeUpdate("INSERT INTO city VALUES (3,'kanpur',876456210,'www.kanpur.com');")
  statement.executeUpdate("INSERT INTO city VALUES (4,'kanpur',876456210,'www.kanpur.com');")
  statement.executeUpdate("INSERT INTO city VALUES (5,'almora',829464,'www.uk.com');")

  var query = statement.executeQuery("select * from city")
  while (query.next()) {
    println(query.getInt(1) + "  " + query.getString(2) + "  " + query.getInt(3) + "  " + query.getString(4));
  }



  val file_writer = new FileWriter("/Users/Saurabh/IdeaProjects/Scala-assignment/src/main/scala/city_data.csv", true)
  try {
    while (query.next()) {
      file_writer.write(query.getInt(1) + "," + query.getString(2) + "," + query.getInt(3) + "," + query.getString(4) + "\n")
    }
  }
  finally file_writer.close()

  // create a spark session
  val ss = SparkSession.builder().master("local").appName("CSVBuilder")
    .config("spark.driver.bindAddress", "127.0.0.1")
    .getOrCreate()

  ss.sparkContext.setLogLevel("ERROR") // suppress logs on console

  //making dataframe df
  var df = ss.read.csv("/Users/Saurabh/IdeaProjects/Scala-assignment/src/main/scala/city_data.csv")
  df.show(10) //printing the dataframe output.
}
