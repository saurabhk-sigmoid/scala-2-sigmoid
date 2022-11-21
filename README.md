# Scala Assignment- Documentation
By Saurabh Kumar

## Purpose of this repository

It consists solutions of Scala Assignment.
## Questions & Solutions
### Question.1.a
Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and largest values in the array.

### Approach

- Use min and max to get the minimum and maximum value from the array.
- Store both the values in other list and return the answer.
- Use try catch to handle the exception when the list will be empty.
- [Solution link](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/Code/code_1a.scala)

### Question.1.b
Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of values less than v, equal to v, and greater than v.

### Approach

- Create a new array of size three to store the count of value less than v, equal to and greater than v.
- Run a loop in the given array and check if value of the element at ith position is less than v, equal to or greater than, then add one value to the new array at the respective position.
- Repeat the same till the end of the array
- Use try catch to handle the exception when the list will be empty.
- [Solution Link](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/Code/code_1b.scala)


### Question.2.

Given an array of integers, produce a new array that contains all positive values of the original array, in their original order, followed by all values that are zero or negative, in their original order.

### Approach

- since we need to update and add the elements in array during run time, we have to use ArrayBufer because array is immutable collection whereas ArrayBuffer is mutable.
- declare two ArrayBuffer, one for keeping positive elemenets and another one for keeping rest of the elements.
- run a loop on the given array, and check if element is postive then add it into the postive arrays otherwise add it into the another array.
- to get the final array, conacat both the arrays.
- Use try catch to handle the exception when the list will be empty.
- [Solution Link](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/Code/code_2.scala)

### Question.3.
Write a function which reads a file/stream and group all anagrams together and print them one by one. (Anagrams means words having the same letters. Both Uppercase and lowercase are same)

### Question.4.

4.Write a program that reads words from a file. Use a mutable,immutable and sorted map respectively to count how often each word appears.// source file: https://www.gutenberg.org/cache/epub/35709/pg35709.txt

### Approach
- to use mutable and sorted map, import hashmap and sorted map collection.
- first read the file using scala.io.Source.fromFile(file_name).mkString.split("\\s+"), and split the words seperated by space and store into list.
- run a loop on the list where all the words stored, then create a hashmap, map and sorted map repectively, and after that keep a counter of the counts of words and store in the map as map[word]=count.
- [Solution Link](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/Code/code_4.scala)


### Question.5.
Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.T\Provide a general superclass UnitConversion and define objects InchesToCentimeters,GallonsToLiters, and MilesToKilometers that extend it.

### Approach
- create a class which will take parameter as a conversion factor, inside class created a private function which will return the double type value after converting.
- to access the private function outside the class, use apply function.
- after defining class, created object version and extends the declared class to use the function.
- declare inchesToCentimeters, gallonsToLiters, and milesToKilometers methods inside the object conversion respectively.
- [Solution Link](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/Code/code_5.scala)

### Question.6.

Write a Scala application, using the App trait, that prints the command-line arguments in reverse order, separated by spaces. For example, scala Reverse Hello World should print World Hello. (Use scalac and scala command)

### Approach

- used the reverse function to get the message in reverse order.
- [Solution link](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/Code/code_6.scala)


### Question.7.
Create a MYSQL schema having a table city with columns: id, name, population,link; where id is a serial number which is unique to a record(this can't be null), name is a string representing name of the city(this can't be null) and population an integer(this can't be null) and link as a web link to the city. Add some random records.
Write a function to connect to the above DB and fetch all records as a list of city. (Hint: Use a table city, create a case class of city and fetch all records.Use mysql-connector-java library)

### Approach
- first downlaod the mysql, and connect to the localhost server.
- Add the library dependencies in [build.sbt](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/build.sbt) and import java.sql.DriverManager to able to use mysql-conector-java.
- make a connection to the mysql server using username and password.
- create database, and then create one table named as city with mentioned columns which can't be having null values.
- After succesfully creating the table, add some records and write an sql query to fetch all the records.
- [Solution Link](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/Code/code_7_and_8.scala)

### Question.8.
8.After fetching all records of city to a list of class City, write it to a file and read it through spark as a df.

### Approach
- After Inserting the data into the city table, with the help of file writer function insert all data into city_data.csv file.
- created spark session and converted the csv data into dataframe.
- print the dataframe using show command.
- [Solution Link](https://github.com/saurabhk-sigmoid/scala-2-sigmoid/blob/main/Code/code_7_and_8.scala)

Dataframe will look like this:
```
+---+-----------+---------+--------------+
|_c0|        _c1|      _c2|           _c3|
+---+-----------+---------+--------------+
|  1|uttarakhand|  2636635|    www.uk.com|
|  2|     serbia|   378435|www.serbia.com|
|  3|     kanpur|876456210|www.kanpur.com|
|  4|     kanpur|876456210|www.kanpur.com|
|  5|     almora|   829464|    www.uk.com|
+---+-----------+---------+--------------+

```
