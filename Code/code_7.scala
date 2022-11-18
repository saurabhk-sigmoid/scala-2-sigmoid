
//Question.7.
/**
Create a MYSQL schema having a table city with columns: id, name, population,link;
 where id is a serial number which is unique to a record(this can't be null), name is a string
 representing name of the city(this can't be null) and population an integer(this can't be null)
 and link as a web link to the city. Add some random records.
 Write a function to connect to the above DB and fetch all records as a list of city.
 (Hint: Use a table city, create a case class of city and fetch all records.Use mysql-connector-java library)

 */

//Code:

import java.sql.DriverManager

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
  while (query.next())
    println(query.getInt(1) + "  " + query.getString(2) + "  " + query.getInt(3) + "  " + query.getString(4));

}