//Question.1.a

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
