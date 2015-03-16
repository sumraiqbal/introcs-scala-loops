import org.scalatest._
import loops._
import scala.util.{ Try, Success, Failure }

/*
 * Note to student: You may NOT change this file (the tests)
 */

class LoopScalaTestFlatSpecMatchers extends FlatSpec with Matchers {

  "stringOfReps()" should "handle empty string" in {
    val result = stringOfReps("",10)
    result should be ("")
  }

  it should "return correct values" in {
    val result = stringOfReps("Banana",3)
    result should be ("BananaBananaBanana")
  }

  it should "also handle spaces" in {
    val result = stringOfReps("Orange ",5)
    result should be ("Orange Orange Orange Orange Orange ")
  }

  "factorial()" should "handle edge cases" in {
    factorial(0) should be (1)
    factorial(-1) should be (1)
  }

  it should "work for normal values" in {
    factorial(1) should be (1)
    factorial(2) should be (2)
    factorial(3) should be (6)
    factorial(4) should be (24)
    factorial(8) should be (40320)
  }

  "printRectangle()" should "handle edge cases" in {
    printRectangle(0, 0, 'a', 'b') should be ("")
  }

  it should "work for normal values" in {
    val out = printRectangle(3, 2, 'i', 'e')
    out should be ("""eeeee
      |eiiie
      |eiiie
      |eeeee""".stripMargin)
    val out2 = printRectangle(6, 2, 'x', 'o')
    out should be ("""oooooooo
      |oxxxxxxo
      |oxxxxxxo
      |oooooooo""".stripMargin)
  }

}

