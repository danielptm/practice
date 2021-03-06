package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: String): String = {
    a + " " + b
  }

  // When you need loops in scala, use recursion.
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n -1)
  }

  println(aRepeatedFunction("hello", 3))
}
