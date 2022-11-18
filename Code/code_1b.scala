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
