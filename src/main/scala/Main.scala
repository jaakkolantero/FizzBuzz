object Main extends App {


  println("Hello, " ++ "Scala!")


  def fizzBuzz(numbers: Seq[Int]): Seq[String] = {

    val isBuzz: Int => String = { number =>
      if (Math.abs(number%5)==0)
        "Buzz"
      else
        ""
    }

    val isFizz: Int => String = { number =>
      if (Math.abs(number%3)==0)
        if(isBuzz(number) == "Buzz") "Fizz " else "Fizz"
      else
        ""
    }

    val isNumber: Int => String = { number =>
      if (isFizz(number) == "Fizz" || isBuzz(number) == "Buzz") "" else number.toString
    }

    val strings:Seq[String] = numbers.map(number => {
      isNumber(number) + isFizz(number) + isBuzz(number)
    })

    strings
  }

  val numbers = (1 to 100).toSeq
  fizzBuzz(numbers).foreach(value => print(s"$value"))

  println(fizzBuzz(Seq()))
}
