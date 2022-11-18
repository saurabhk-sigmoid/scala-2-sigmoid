# Scala Assignment
By Saurabh Kumar

## Purpose of this repository

It consists solutions of Scala Assignment.
## Questions

1.Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and largest values in the array.Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of values less than v, equal to v, and greater than v.

2.Given an array of integers, produce a new array that contains all positive values of the original array, in their original order, followed by all values that are zero or negative, in their original order.

3.Write a function which reads a file/stream and group all anagrams together and print them one by one. (Anagrams means words having the same letters. Both Uppercase and lowercase are same)

4.Write a program that reads words from a file. Use a mutable,immutable and sorted map respectively to count how often each word appears.// source file: https://www.gutenberg.org/cache/epub/35709/pg35709.txt

5.Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.T\Provide a general superclass UnitConversion and define objects InchesToCentimeters,GallonsToLiters, and MilesToKilometers that extend it.

6.Write a Scala application, using the App trait, that prints the command-line arguments in reverse order, separated by spaces. For example, scala Reverse Hello World should print World Hello. (Use scalac and scala command)

7.Create a MYSQL schema having a table city with columns: id, name, population,link; where id is a serial number which is unique to a record(this can't be null), name is a string representing name of the city(this can't be null) and population an integer(this can't be null) and link as a web link to the city. Add some random records.
Write a function to connect to the above DB and fetch all records as a list of city. (Hint: Use a table city, create a case class of city and fetch all records.Use mysql-connector-java library)

8.After fetching all records of city to a list of class City, write it to a file and read it through spark as a df.
