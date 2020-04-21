package lectures.part1basics

//Extending app makes it able to be run like main method in intellij
object Expressions extends App {
  val x = 1 + 2
  println(x)

  // Order of operations is the same as in real life
  println(2 + 3 * 4)

  // Tests for equality
  println(1 == x)

  //Not equals
  println(1 != x)

  // Same as above
  println(!(1 == x))


  var aVariable = 2
  aVariable += 3 // Also works with -=, *=, /=

  println(aVariable)

  // Instructions (Do) vs Expressions
  // If expressions give back values, different from other languages
  println("Conditions:")
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  //Loops --- Should be avoided in Scala ... Because imperative code is not too good in scala
  // The value is unit
  var  i = 0
  val awhile = while (i < 10) {
    i += 1
    println(i)
  }

  //Don't write code like this in scala
  val aWierdValue = (aVariable = 3) // Unit === void
  //Prints ()
  println(aWierdValue)

  // Code blocks are expressions, there contents are not visible outside
  val aCodeBlock = {
    val y = 2
    val z = 1

    if (z > y) "hello" else "goodbye"
  }

  val cb2 = {
    val x = 1 + 2
    3
  }

  println(cb2)



}
