
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
  df.show() //printing the dataframe output.
}
