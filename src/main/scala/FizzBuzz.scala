package fizzBuzz

trait Fizz extends Buzz {
  val isFizz: Int => String = { number =>
    if (Math.abs(number%3)==0)
      if(isBuzz(number) == "Buzz") "Fizz " else "Fizz"
    else
      ""
  }
}

trait Buzz {
  val isBuzz: Int => String = { number =>
    if (Math.abs(number%5)==0)
      "Buzz"
    else
      ""
  }
}

trait FizzBuzzNumber extends Fizz with Buzz {
  val isNumber: Int => String = { number =>
    if (isFizz(number) == "Fizz" || isBuzz(number) == "Buzz") "" else number.toString
  }
}

object FizzBuzz extends Fizz with Buzz with FizzBuzzNumber {
  def fizzBuzz(numbers: Seq[Int]): Seq[String] = {
    val strings:Seq[String] = numbers.map(number => {
      isNumber(number) + isFizz(number) + isBuzz(number)
    })

    strings
  }
}