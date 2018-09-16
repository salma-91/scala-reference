class Curryfication {

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sumF(a + 1, b)

    sumF
  }

  // val sumInts = sum(x => x)
  //val sumSquares = sum(x => x * x)
  //val sumPowersOfTwo = sum(powerOfTwo)
  def sumInts = sum(x => x)

  def sumSquares = sum(x => x * x)

  //def sumPowersOfTwo = sum(powerOfTwo)
}

object Curryfication {
  def main(args: Array[String]): Unit = {

  }
}
