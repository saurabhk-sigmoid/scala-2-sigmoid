
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

