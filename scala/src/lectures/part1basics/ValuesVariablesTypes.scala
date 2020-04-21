package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  val y = 42
  println(x)
  println(y)
  //Vals are immutable
  //Compiler can infer types

  // You can create expressions with semi colon, but its better not to
  val aString: String = "Hello";
  println(aString)

  val aboolean: Boolean = true
  println(aboolean)

  //Chars are like java with single quotes
  val aChar: Char = 'a'
  println(aChar)

  // Compiler will complain if more digits than this
  val aShort: Short = 12341

  //Similar to java syntax
  val aLong: Long = 123123123112312L

  // use f at the end to indicate float
  val aFloat: Float = 2.0f

  //
  val aDouble: Double = 3.14

  //Vars can be reassigned but the type has to remain same
  var aVariable = "hi"
  aVariable = "bye"

}
