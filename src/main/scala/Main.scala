import fizzBuzz.FizzBuzz

object Main extends App {
  val numbers = (1 to 100).toSeq
  FizzBuzz.fizzBuzz(numbers).foreach(value => println(s"$value"))
}
