import org.scalatest.FlatSpec

class FizzBuzzSpec extends FlatSpec {
  "FizzBuzz" should "not compile if no arguments given" in {
    assertDoesNotCompile("val strings = Main.fizzBuzz()")
  }

  it should "work with negative numbers" in {
    val input:Seq[Int] = Seq(-2,-3,-4,-5,-15)
    val output:Seq[String] = Seq("-2","Fizz","-4","Buzz","Fizz Buzz")
    assert(Main.fizzBuzz(input) == output)
  }

  it should "work with positive number" in {
    val input:Seq[Int] = Seq(2,3,4,5,15)
    val output:Seq[String] = Seq("2","Fizz","4","Buzz","Fizz Buzz")
    assert(Main.fizzBuzz(input) == output)
  }

  it should "work with empty Seq" in {
    val emptySeq = Main.fizzBuzz(Seq())
    assertCompiles("val emptySeq = Main.fizzBuzz(Seq())")
    assert(emptySeq.isEmpty)
  }


}