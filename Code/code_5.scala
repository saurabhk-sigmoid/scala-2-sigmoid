
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

