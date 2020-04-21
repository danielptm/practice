package lectures.part1basics
import org.scalatest.FlatSpec


class FunctionsTest extends FlatSpec{
  it should "Return 'a b' " in {
    val x = Functions.aFunction("a", "b")
    assert("a b" == x)
  }
}
